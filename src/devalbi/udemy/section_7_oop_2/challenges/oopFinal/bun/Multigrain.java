package devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun;

public class Multigrain extends Bun {

    //Created class to use Compounding
    public Multigrain(String name) {
        super(name);
    }

    public Multigrain() {
        super("Multigrain Bun");
    }

    @Override
    public void bunDetails() {
        System.out.println("This is a multigrain bun");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
