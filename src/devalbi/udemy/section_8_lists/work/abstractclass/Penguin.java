package devalbi.udemy.section_8_lists.work.abstractclass;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Penguins do cannot fly");
    }
}
