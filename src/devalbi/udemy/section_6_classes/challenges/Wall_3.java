package devalbi.udemy.section_6_classes.challenges;

public class Wall_3 {

    private double width, height;

    public Wall_3(){}

    public Wall_3(double width, double height) {
        if(width > 0.0d) {
            this.width = width;
        } else {
            this.width = 0.0d;
        }
        if(height > 0.0d) {
            this.height = height;
        } else {
            this.height = 0.0d;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if(width > 0.0d) {
            this.width = width;
        } else {
            this.width = 0.0d;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0.0d) {
            this.height = height;
        } else {
            this.height = 0.0d;
        }
    }

    public double getArea(){
        return height * width;
    }
}
