package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat;

public class BurgerPatty {

    private String meat;

    public BurgerPatty() {
        this("hamburger");
    }

    public BurgerPatty(String meat) {
        this.meat = meat;
    }

    public String getMeat() {
        return meat;
    }
}
