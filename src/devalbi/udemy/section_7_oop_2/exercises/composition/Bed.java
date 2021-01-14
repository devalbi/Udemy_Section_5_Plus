package devalbi.udemy.section_7_oop_2.exercises.composition;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;


    public Bed() {
        this("modern", 2, 50, 2, 1);
    }

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
