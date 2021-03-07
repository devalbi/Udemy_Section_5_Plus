package devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats;

public class Beef extends Patty {

    //Created class to use Compounding
    public Beef(String name) {
        super(name);
    }

    public Beef() {
        super("BurgerPatty");
    }

    @Override
    public void meatDetails() {
        System.out.println("This is BurgerPatty patty");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
