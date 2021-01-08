package devalbi.udemy.section_6_oop_1.exercises.inheritance.cylinder;

public class Cylinder2 extends Circle2 {

    private double height;

    public Cylinder2(double radius, double height) {
        super(radius);
        if(height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }

    public double getVolume() {
        double area = super.getArea();
        double volume = area * height;

        return volume;
    }

    public double getHeight() {
        return height;
    }
}
