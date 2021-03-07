package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun;

public class Basebun {

    private String bunName;

    public Basebun() {
        this("Base Roll");
    }

    public Basebun(String bunName) {
        this.bunName = bunName;
    }

    public String getBunName() {
        return bunName;
    }
}
