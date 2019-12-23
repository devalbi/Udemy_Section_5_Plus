package devalbi.udemy.section_7_oop_2.challenges.polymorphism;

public class VW extends Car {


    public VW(int cylinders, String make) {
        super(cylinders, 4, true, make);
    }

    @Override
    public void carDetails(){
        System.out.println(getMake() + " has " + getCylinders() + " cylinders, \n" +
                "has " + getWheels() + " wheels \n" +
                getMake() + " are a German Company \n");
    }
}
