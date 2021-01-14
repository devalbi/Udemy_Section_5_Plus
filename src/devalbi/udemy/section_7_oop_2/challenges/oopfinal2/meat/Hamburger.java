package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat;

public class Hamburger {

    private String meat;

    public Hamburger() {
        this("hamburger");
    }

    public Hamburger(String meat) {
        this.meat = meat;
    }

    public String getMeat() {
        return meat;
    }
}
