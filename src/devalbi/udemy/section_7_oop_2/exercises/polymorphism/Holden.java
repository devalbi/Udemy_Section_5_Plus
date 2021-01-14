package devalbi.udemy.section_7_oop_2.exercises.polymorphism;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden engine has started.");
    }

    public void accelerate() {
        System.out.println("Holden is accelerating.");
    }

    public void brake() {
        System.out.println("Holden is braking.");
    }
}
