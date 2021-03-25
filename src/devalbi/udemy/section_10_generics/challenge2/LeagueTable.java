package devalbi.udemy.section_10_generics.challenge2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable <T extends Team> {

    private List<T> teamsInLeague = new ArrayList<>();
    private String leagueName;

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeamToLeague(T team) {
        if((team.equals(null)) || (teamsInLeague.contains(team)) ) {
            return false;
        }

        teamsInLeague.add(team);
        return true;
    }

    protected void printLeagueTable() {
        if(teamsInLeague.isEmpty()) {
            System.out.println("League has no teams in it. ");
        }

        Collections.sort(teamsInLeague);

        System.out.println("League: " + this.leagueName);

        for (T team: teamsInLeague) {
            System.out.println("Team: " +
                    team.getTeamName() +
                    ", points: " +
                    team.getTeamPoints());
        }
    }
}
