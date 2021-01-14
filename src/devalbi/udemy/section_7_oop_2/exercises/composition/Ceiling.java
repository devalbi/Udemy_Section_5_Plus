package devalbi.udemy.section_7_oop_2.exercises.composition;

public class Ceiling {

    private int height;
    private int paintedColor;

    public Ceiling() {
        this(400, 10001);
    }

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
