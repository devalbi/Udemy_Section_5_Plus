package devalbi.udemy.section_10_generics.challenge2;

public class Main {


    public static void main(String[] args) {


        LeagueTable<FootballTeam> footballLeagueTable = new LeagueTable("Wicklow Div 1A");
        FootballTeam kilmac = new FootballTeam("Kilmacanogue", 10);
        FootballTeam bray = new FootballTeam("Bray", 15);
        FootballTeam roundwood = new FootballTeam("roundwood", 5);
        HurlingTeam carnew = new HurlingTeam("Carnew", 7);

        footballLeagueTable.addTeamToLeague(kilmac);
        footballLeagueTable.addTeamToLeague(bray);
        footballLeagueTable.addTeamToLeague(roundwood);

        footballLeagueTable.printLeagueTable();


    }
}
