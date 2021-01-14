package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun;

public class Bun {

    private String bunName;

    public Bun() {
        this("Bread Roll");
    }

    public Bun(String bunName) {
        this.bunName = bunName;
    }

    public String getBunName() {
        return bunName;
    }
}
