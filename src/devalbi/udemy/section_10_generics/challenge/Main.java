package devalbi.udemy.section_10_generics.challenge;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        LeagueTable<FootballTeam> footballLeagueTable = new LeagueTable("Wicklow Div 1A");
        FootballTeam kilmac = new FootballTeam("Kilmacanogue");
        FootballTeam bray = new FootballTeam("Bray");
        FootballTeam roundwood = new FootballTeam("roundwood");
        HurlingTeam carnew = new HurlingTeam("Carnew");

        footballLeagueTable.addTeam(kilmac);
        footballLeagueTable.addTeam(bray);
        footballLeagueTable.addTeam(roundwood);

      //  footballLeagueTable.addTeam(carnew);


        footballLeagueTable.matchResult(kilmac, bray, 1, 2);
        footballLeagueTable.matchResult(kilmac, roundwood, 3, 8);
        footballLeagueTable.matchResult(bray, kilmac, 2,1);
        footballLeagueTable.matchResult(bray, roundwood, 1, 1);
        //footballLeagueTable.matchResult(carnew, roundwood, 1, 1);

        footballLeagueTable.printLeagueTable();





    }
}
