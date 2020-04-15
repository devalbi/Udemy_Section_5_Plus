package devalbi.udemy.section_10_generics.challenge;

public class FootballTeam extends Team<Team<Team>> {

    public FootballTeam(String name) {
        super(name);
    }

}
