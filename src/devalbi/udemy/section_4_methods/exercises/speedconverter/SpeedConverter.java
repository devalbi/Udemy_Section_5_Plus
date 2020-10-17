package devalbi.udemy.section_4_methods.exercises.speedconverter;

import java.util.Map;

public class SpeedConverter {

    //NOTE: 1 mile per hour is 1.609 kilometers per hour

    public static int toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            int milesPerHour = (int) Math.round(kilometersPerHour / 1.609d);
            return milesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            int milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}

