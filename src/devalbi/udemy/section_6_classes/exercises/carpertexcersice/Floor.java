package devalbi.udemy.section_6_classes.exercises.carpertexcersice;

public class Floor {
    private double length, width;

    public Floor(double length, double width){
        if(length > 0.0d ){
            this.length = length;
        } else {
            this.length = 0.0d;
        }
        if(width > 0.0d){
            this.width = width;
        } else {
            this.width = 0.0d;
        }
    }

    public double getArea(){
        return (length * width);
    }
}

    /*1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
    The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
    In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
    Write the following methods (instance methods):
    * Method named getArea without any parameters, it needs to return the calculated area (width * length).*/
