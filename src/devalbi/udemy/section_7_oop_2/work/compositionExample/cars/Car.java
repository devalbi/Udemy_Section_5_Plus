package devalbi.udemy.section_7_oop_2.work.compositionExample.cars;

/**
 * Created by dev on 16/07/15.
 */
public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
