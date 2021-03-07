package devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun;

public class WhiteBun extends Bun{

    public WhiteBun(String name) {
        super(name);
    }

    public WhiteBun() {
        super("White Basebun");
    }

    @Override
    public void bunDetails() {
        System.out.println("This is a white bun");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
