package devalbi.udemy.section_10_generics.challenge;

public class HurlingTeam extends Team<Team<Team>> {

    public HurlingTeam(String name) {
        super(name);
    }
}
