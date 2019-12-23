package devalbi.udemy.section_7_oop_2.challenges.inheritance.room;

public class Ceiling {
    private Floor floor;
    private double width, length;


    public Ceiling(Floor floor) {
        width = floor.getWidth();
        length = floor.getLenght();
    }


}
