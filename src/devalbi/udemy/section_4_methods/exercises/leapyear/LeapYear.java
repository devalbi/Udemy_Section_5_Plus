package devalbi.udemy.section_4_methods.exercises.leapyear;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            System.out.println("False");
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if(year % 400 == 0) {
                        System.out.println("true");
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    System.out.println("true");
                    return true;
                }
            } else {
                System.out.println("false");
                return false;
            }
        }
    }
}


/*   public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {return true;}
            } else {
                return false;
            }
        } else {
            return false;
        }
    }*/