package devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats;

public class Veggie extends Patty {
    public Veggie(String name) {
        super(name);
    }

    public Veggie() {
        super("Veggie");
    }

    @Override
    public void meatDetails() {
        System.out.println("This is veggie patty");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

