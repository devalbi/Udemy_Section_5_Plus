package devalbi.udemy.exercises;

public class NumberOfDaysInMonth_2 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(12,2020));
        System.out.println(getDaysInMonth(0,2020));
        System.out.println(getDaysInMonth(13,2020));
        System.out.println(getDaysInMonth(5,2020));
    }

    public static boolean isLeapYear(int year){
        if((year < 1) || (year > 9999)){
            return false;
        }
            if(((year % 4) == 0) && ((year % 100) != 0)){
                    return true;
            } else if ((year % 400) == 0) {
                    return true;
            } else {
                return false;
            }
    }

    //Check if leap year then feb needs to be different. might need to use if with switch.
    public static int getDaysInMonth(int month, int year){
        int days;
        if((month < 1) || (month > 12) || (year < 1 ) || (year > 9999)) {
            return -1;
        }
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year)){
                    days =  29;
                    break;
                }else {
                    days =  28;
                    break;
                }
            default:
                days = -1;
                break;
        }
        return days;
    }
}
