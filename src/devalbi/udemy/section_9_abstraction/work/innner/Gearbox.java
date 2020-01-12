package devalbi.udemy.section_9_abstraction.work.innner;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {

    private List<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 0; i < maxGears; i++){
            addGear(i, 5.53);
        }

    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
         if((number > 0) && (number <= maxGears) ){
             this.gears.add(new Gear(number, ratio));
         }
    }

    public void changeGear(int newGear){
        if((newGear >= 0) && (newGear < gears.size()) &&(this.clutchIsIn)){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream");
            return 0.0d;
        } else {
            /*Access private Gears class using getters*/
            return revs * gears.get(currentGear).getRatio();
        }
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        /*this.gearNumber refers to variable in Gear
        * Not field in GearBox
        *
        * variable gearNumber in Gear is said to be "Shadowing" variable in wrapper class.
        * Do not want this, can cause issue: readability, refactoring, confusion.
        *
        * To use Gearbox variable, do the following:
        * Gearbox.this.gearNumber = gearNumber;*/
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }


}
