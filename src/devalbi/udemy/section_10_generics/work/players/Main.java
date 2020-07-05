package devalbi.udemy.section_10_generics.work.players;

public class
Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat =  new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

/*      This now causes an error with these players as they do not meet criteria(Not football Players)
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);*/

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Redskins");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester Utd");

        Team<FootballPlayer> secondTeam = new Team<>("Second Team");
        FootballPlayer joeBlogs = new FootballPlayer("Joe Bloggs");
        secondTeam.addPlayer(joeBlogs);

        Team<FootballPlayer> thirdTeam = new Team<>("Third Team");
        FootballPlayer harry = new FootballPlayer("Harry");
        thirdTeam.addPlayer(harry);

        adelaideCrows.matchResult(secondTeam, 1, 0);
        adelaideCrows.matchResult(thirdTeam, 3, 8);
        secondTeam.matchResult(adelaideCrows, 2,1);
        secondTeam.matchResult(secondTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(secondTeam.getName() + ": " + secondTeam.ranking());
        System.out.println(thirdTeam.getName() + ": " + thirdTeam.ranking());

        System.out.println(adelaideCrows.compareTo(secondTeam));
        System.out.println(adelaideCrows.compareTo(thirdTeam));

        //Should not work as not of the same type
        //secondTeam.matchResult(baseballTeam, 1, 1);

        //This will cause issue due to player cast in Team class
/*        Team<String> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer("no-one");*/
    }
}
