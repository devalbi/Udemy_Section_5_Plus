package devalbi.udemy.section_7_oop_2.challenges.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(8);
        Ford ford = new Ford(6, "Mondeo");
        Nissan nissan = new Nissan(4, "Evo");
        VW vw =  new VW(5, "Golf");

        //Testing Polymorphism
        Car vw1 = new VW(4, "Polo");

        //Does not allow
        //VW vw2 = new Car(4, "Up!");

        car1.carDetails();
        ford.carDetails();
        nissan.carDetails();
        vw.carDetails();
        vw1.carDetails();
    }
}
