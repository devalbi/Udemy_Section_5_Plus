package devalbi.udemy.section_7_oop_2.exercises.polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford engine has started.");
    }

    public void accelerate() {
        System.out.println("Ford is accelerating.");
    }

    public void brake() {
        System.out.println("Ford is braking.");
    }
}
