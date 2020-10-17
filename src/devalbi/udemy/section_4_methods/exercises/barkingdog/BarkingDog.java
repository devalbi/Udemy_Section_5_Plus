package devalbi.udemy.section_4_methods.exercises.barkingdog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if (!barking) {
            System.out.println("false");
            return false;
        } else if( hourOfDay > 23 || hourOfDay < 0) {
            System.out.println("false");
            return false;
        } else if ((hourOfDay <= 22) && (hourOfDay >= 8)) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }
}
