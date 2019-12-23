package devalbi.udemy.section_7_oop_2.challenges.inheritance.room;

public class Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Floor floor;
    private Light light;

    private Chair chair;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Floor floor) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.floor = floor;
    }

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Floor floor, Chair chair) {
        this(wall1, wall2, wall3, wall4, ceiling, floor);
        this.chair = chair;
    }

    public void turnWallLightSwitch(){
        wall1.switchLight();
    }

    public void checkLight(){
        if(wall1.getLightStatus() == true){
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }
    }

}
