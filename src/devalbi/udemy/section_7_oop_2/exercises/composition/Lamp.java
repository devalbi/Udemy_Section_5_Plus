package devalbi.udemy.section_7_oop_2.exercises.composition;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp() {
        this("modern", false, 10);
    }

    public Lamp (String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public boolean isBattery() {
        return battery;
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }
}
