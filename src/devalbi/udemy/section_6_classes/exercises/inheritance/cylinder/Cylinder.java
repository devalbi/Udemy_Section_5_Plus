package devalbi.udemy.section_6_classes.exercises.inheritance.cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
/*        double area = super.getArea();*/
        return super.getArea() * height;
    }
}

/*
    2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
    The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
    In case the height parameter is less than 0 it needs to set the height field value to 0.

    Write the following methods (instance methods):
    * Method named getHeight without any parameters, it needs to return the value of height field.
    * Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.*/
