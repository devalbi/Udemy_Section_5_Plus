package devalbi.udemy.section_7_oop_2.exercises.polymorphism;

public class Mistubishi extends Car {

    public Mistubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine() {
        System.out.println("Mistubishi engine has started.");
    }

    public void accelerate() {
        System.out.println("Mistubishi is accelerating.");
    }

    public void brake() {
        System.out.println("Mistubishi is braking.");
    }
}
