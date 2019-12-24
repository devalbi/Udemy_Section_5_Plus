package devalbi.udemy.section_7_oop_2.challenges.oopFinal.dulexe;

public class Drink {

    private String flavour;
    private String size;

    public Drink(String flavour, String size) {
        this.flavour = flavour;
        this.size = size;
    }

    public Drink(String flavour) {
        this.flavour = flavour;
        this.size = "Regular";
    }

    public Drink() {
        this.flavour = "Coke";
        this.size = "Regular";
    }

    public String getFlavour() {
        return flavour;
    }

    public String getSize() {
        return size;
    }
}
