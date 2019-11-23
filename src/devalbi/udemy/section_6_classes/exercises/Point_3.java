package devalbi.udemy.section_6_classes.exercises;

import java.awt.*;

public class Point_3 {

    private int x, y;

    public Point_3(){
        this(0, 0);
    }

    public Point_3(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double point =  distance(0,0);
        return point;
    }

    public double distance(int x2, int y2){
        double point =  Math.sqrt((double) (x2 -x) * (x2 - x) + (y2 - y) * (y2 - y));
        return point;
    }

    public double distance(Point_3 pointB){
        int xb =  pointB.getX();
        int yb =  pointB.getY();
        double point = distance(xb, yb);

        return point;
    }
}

/*
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.

    The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

    Write the following methods (instance methods):
    * Method named getX without any parameters, it needs to return the value of x field.
    * Method named getY without any parameters, it needs to return the value of y field.
    * Method named setX with one parameter of type int, it needs to set the value of the x field.
    * Method named setY with one parameter of type int, it needs to set the value of the y field.
    * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
    * Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
    * Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

    How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

    d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    Where √ represents square root.

    TEST EXAMPLE
    → TEST CODE:
    Point first = new Point(6, 5);
    Point second = new Point(3, 1);
    System.out.println("distance(0,0)= " + first.distance());
    System.out.println("distance(second)= " + first.distance(second));
    System.out.println("distance(2,2)= " + first.distance(2, 2));
    Point point = new Point();
    System.out.println("distance()= " + point.distance());

    OUTPUT
    distance(0,0)= 7.810249675906654
    distance(second)= 5.0
    distance(2,2)= 5.0
    distance()= 0.0

    NOTE: Use Math.sqrt to calculate the square root √.
    NOTE: Try to avoid duplicated code.
    NOTE: All methods should be defined as public NOT public static.
    NOTE: In total, you have to write 7 methods.
    NOTE: Do not add a main method to the solution code.
*/
