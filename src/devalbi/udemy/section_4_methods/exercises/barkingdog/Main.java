package devalbi.udemy.section_4_methods.exercises.barkingdog;

public class Main {

    public static void main(String[] args) {
        BarkingDog bark = new BarkingDog();
        bark.shouldWakeUp(true, 1);
        bark.shouldWakeUp(false, 2);
        bark.shouldWakeUp(true, 8);
        bark.shouldWakeUp(true, -1);
    }

}
