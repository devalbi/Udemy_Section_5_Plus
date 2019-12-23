package devalbi.udemy.section_7_oop_2.challenges.inheritance.room;

public class Wall {
    private double height;
    private double length;
    private String material;
    private Light lightSwitch;


    public Wall(double height, double length,String material, Light lightSwitch) {
        this.height = height;
        this.length = length;
        this.lightSwitch = lightSwitch;
    }

    public Wall(double height, double length, String material) {
        this.height = height;
        this.length = length;
        this.material = material;
    }

    public double getHeight() {
        return height;
    }


    public double getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public void switchLight(){
        lightSwitch.turnOnOff();
    }

    public boolean getLightStatus(){
        return lightSwitch.getLight();
    }
}
