package devalbi.udemy.section_12_collections.work.sets.equalexample;

public class DogMain {

    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        //sub-class is instanceof super-class
        //Labrador is instanceof Dog
        System.out.println(rover2.equals(rover));

        //super-class is NOT instanceof sub-class
        //Dog is NOT instanceof Labrador
        System.out.println(rover.equals(rover2));
    }
}
