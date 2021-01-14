package devalbi.udemy.section_7_oop_2.exercises.polymorphism;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "Lada");
        car.startEngine();
        car.accelerate();
        car.brake();

        Ford ford = new Ford(3, "Fiesta");
        Car ford2 = new Ford(4, "Ford"); //Allowed
        //Ford ford2 = new Car(4, "Ford"); causes errors
        ford2.startEngine();
        ford2.accelerate();
        ford2.brake();
    }
}
