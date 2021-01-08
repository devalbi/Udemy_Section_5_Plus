package devalbi.udemy.section_6_oop_1.exercises.inheritance.cylinder;

public class Circle2  {

    private double radius;

    public Circle2(double radius) {
        if(radius < 0) {
            this. radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = (radius * radius) * (Math.PI);

        return area;
    }
}
