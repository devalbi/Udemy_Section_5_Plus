package devalbi.udemy.section_7_oop_2.challenges.polymorphism;

public class Nissan extends Car {

     public Nissan(int cylinders, String make) {
         super(cylinders, 4, true, make);
     }

    @Override
    public void carDetails(){
        System.out.println(getMake() + " has " + getCylinders() + " cylinders, \n" +
                "has " + getWheels() + " wheels \n" +
                getMake() + " are a Japanese Company \n");
    }

}
