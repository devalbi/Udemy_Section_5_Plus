package devalbi.udemy.section_7_oop_2.challenges.inheritance.room;

public class Main {
    public static void main(String[] args) {
        Light light = new Light(false);
        Wall wall1 = new Wall(10.0d, 13.0d, "Plaster", light);
        Wall wall2 = new Wall(10.0d, 13.0d, "Plaster");
        Wall wall3 = new Wall(10.0d, 13.0d, "Plaster");
        Wall wall4 = new Wall(10.0d, 13.0d, "Plaster");
        Chair chair = new Chair(4,5.0d, 2.0d, 2.0d);

        Floor floor =  new Floor(15.0d, 10.0d, "Carpet");
        Ceiling ceiling =  new Ceiling(floor);

        Room room = new Room(wall1, wall2, wall3, wall4, ceiling, floor, chair);
        room.checkLight();
        room.turnWallLightSwitch();
        room.checkLight();
    }


}
