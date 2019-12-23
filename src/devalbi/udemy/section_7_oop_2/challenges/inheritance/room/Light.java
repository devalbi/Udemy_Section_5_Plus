package devalbi.udemy.section_7_oop_2.challenges.inheritance.room;

public class Light {
    private boolean light;

    public Light(boolean light) {
        this.light = light;
    }

    public boolean getLight() {
        return light;
    }

    public boolean turnOnOff(){
        if(light == true){
            light = false;
            System.out.println("Light has been turned off..");
            return light;
        } else {
            light = true;
            System.out.println("Light has been turned on..");
            return light;
        }
    }
}
