package devalbi.udemy.section_7_oop_2.challenges.inheritance.room;

public class Floor {
    private double width, lenght;
    private String floorMaterial;

    public Floor(String floorMaterial) {
        this.floorMaterial = floorMaterial;
    }

    public Floor(double width, double lenght, String floorMaterial) {
        if(width> 0) {
            this.width = width;
        } else {
            width = 0;
        }
        if(lenght> 0) {
            this.lenght = lenght;
        } else {
            this.lenght = 0;
        }
        this.floorMaterial = floorMaterial;
    }

    public Floor(double width, double lenght) {
        this("Concrete");
        if(width> 0) {
            this.width = width;
        } else {
            width = 0;
        }
        if(lenght> 0) {
            this.lenght = lenght;
        } else {
            this.lenght = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getFloorMaterial() {
        return floorMaterial;
    }

    public void setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
    }
}
