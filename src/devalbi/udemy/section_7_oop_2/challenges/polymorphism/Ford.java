package devalbi.udemy.section_7_oop_2.challenges.polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String make) {
        super(cylinders, 4, true, make);
    }

    @Override
    public void carDetails(){
        System.out.println(getMake() + " has " + getCylinders() + " cylinders, \n" +
                "has " + getWheels() + " wheels \n" +
                getMake() + " are an American Company \n");
    }

}
