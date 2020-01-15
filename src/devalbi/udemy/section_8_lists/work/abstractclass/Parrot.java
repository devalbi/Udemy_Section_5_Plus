package devalbi.udemy.section_8_lists.work.abstractclass;

public class Parrot extends Bird {


    public Parrot(String name) {
        super(name);
    }

    //Only has to implement direct parent methods.
    @Override
    public void fly() {
        System.out.printf("Flying");
    }
}
