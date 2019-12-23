package devalbi.udemy.section_7_oop_2.challenges.inheritance.room;

public class Chair {
    private int legs;
    private double height;
    private double width;
    private double length;

    public Chair(int legs, double height, double width, double length) {
        if(height> 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
        if(width> 0) {
            this.width = width;
        } else {
            width = 0;
        }
        if(length> 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    public Chair(int legs) {
        if(legs> 0) {
            this.legs = legs;
        } else {
            legs = 4;
        }
    }

    public Chair(int height, int width, int length) {
        this(4);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getLegs() {
        return legs;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
