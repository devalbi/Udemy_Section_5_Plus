package devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats;

public class Chicken extends Patty {

    public Chicken(String name) {
        super(name);
    }

    public Chicken() {
        super("Chicken");
    }

    @Override
    public void meatDetails() {
        System.out.println("This is Chicken patty");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
