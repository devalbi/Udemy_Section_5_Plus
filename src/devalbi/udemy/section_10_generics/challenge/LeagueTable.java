package devalbi.udemy.section_10_generics.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();;

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println(team.getName() + " already exists in the league.");
             return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " is added to the league.");
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public List<T> getTeams() {
        return teams;
    }

    public void printLeagueTable(){
        geTeamRankings();
        int rank = 1;
        for(T team : teams){
            System.out.println(rank + ". " + team.getName()+"\n" );
            rank++;
        }
    }

    public void geTeamRankings(){
        Collections.sort(teams);
    }

    public void matchResult(T home,T opponent, int homeScore, int opponentScore){
        if(teams.contains(home) && teams.contains(opponent) ) {
            String message;
            if (homeScore > opponentScore) {
                home.addWon();
                opponent.addLost();
                message = " beat ";
            } else if (homeScore == opponentScore) {
                home.addTied();
                opponent.addTied();
                message = " drew with ";
            } else {
                home.addLost();
                opponent.addLost();
                message = " lost to ";
            }
                System.out.println(home.getName() + message + opponent.getName());
         } else {
            System.out.println(home + " and " + opponent + " are not in the same league.");
        }
    }


}
