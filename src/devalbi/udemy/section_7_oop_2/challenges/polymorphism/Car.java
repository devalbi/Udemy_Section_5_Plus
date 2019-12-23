package devalbi.udemy.section_7_oop_2.challenges.polymorphism;

/*
* Create base Car class
* Have a few fields: Engine, Cylinders, wheels, model, make
* Constructor should initialize Cylinders #, name and set of 4 wheels
* Engine should run true
*
* Create appropriate getters
*
* Methods: startEngine. accelerate, brake
*
* Show message for each in the base class
*
*
* Create 3 sub classes for different vehicles
* Override appropriate methods to demonstrate polymorphism
*
* */

import devalbi.udemy.section_6_oop_1.exercises.inheritance.cylinder.Cylinder;
import org.w3c.dom.ls.LSOutput;

public class Car {
    private int cylinders, wheels, velocity;
    private boolean engine;
    private String make;

    public Car(int cylinders, int wheels, boolean engine, String make){
        this(cylinders);
        if(wheels < 0){
            this.wheels = 4;
        } else {
            this.wheels = wheels;
        }
        this.make = make;
        this.engine = engine;
    }

    public Car(int cylinders){
        if((cylinders < 0) || (cylinders > 16)) {
            this.cylinders = 4;
        } else {
            this.cylinders = cylinders;
        }
        this.wheels = 4;
        this.engine = false;
        velocity = 0;
    }

    public void carDetails(){
        System.out.println(getMake() + " has " + getCylinders() + " cylinders, \n" +
                "has " + getWheels() + " wheels \n");
    }

    public void startEngine(){
        if(!isEngine()){
            setEngine(true);
            System.out.println("Starting " + getMake() + " Engine...Engine is on");
        } else {
            System.out.println(getMake() + " Engine is already on!");
        }
    }

    public void killEngine(){
        if(!isEngine()){
            setEngine(false);
            System.out.println("Killing " + getMake() + " Engine...Engine is off");
        } else {
            System.out.println(getMake() + "Engine is already off!");
        }
    }

    public void accelerate(int accelerate){
        if(!isEngine()) {
            changeVelocity(accelerate);
            System.out.println(getMake() + " is accelerating by 5kph, speed is now: " + getVelocity());
        } else {
            System.out.println("Engine is off, " + getMake() + " cannot accelerate");
        }
    }

    public void brake(int decelerate){
        changeVelocity(-1 * decelerate);
        if(getVelocity() < 0){
            setVelocity(0);
            System.out.println(getMake() + " has come to a stop");
            return;
        }
        System.out.println(getMake() + " is decelerating by 5kph, speed is now: " + getVelocity());
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getMake() {
        return make;
    }

    public void changeVelocity(int change){
        velocity += change;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public boolean isEngine() {
        return engine;
    }
}
