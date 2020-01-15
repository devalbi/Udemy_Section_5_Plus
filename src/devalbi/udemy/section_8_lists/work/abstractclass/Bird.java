package devalbi.udemy.section_8_lists.work.abstractclass;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println(getName() + " is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
