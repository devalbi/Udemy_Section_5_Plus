package devalbi.udemy.Section_5.challenges.challnege_2;

public class NumberofDaysInMonth {

    public static void main(String[] args) {
        NumberofDaysInMonth n = new NumberofDaysInMonth();

        n.getDaysInMonth(1, 2020);
        n.getDaysInMonth(2, 2020);
        n.getDaysInMonth(2, 2018);
        n.getDaysInMonth(-1, 2020);
        n.getDaysInMonth(1, -2020);
    }

    public boolean isLeapYear(int year) {
        if ((year <= 0) || (year >= 9999)) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public int getDaysInMonth(int month, int year) {
        if (((month < 1) || (month > 12)) || ((year <= 0) || (year >= 9999))) {
            System.out.println("Error with Year or Month");
            return -1;
        }

        int days;
        if (isLeapYear(year) && (month == 2)) {
            days = 29;
            System.out.println(year + " is a leap year, and month is  " + month + " so the number of days are " + days);
            return days;
        } else {
            switch (month) {
                case (1):
                case (3):
                case (5):
                case (7):
                case (8):
                case (10):
                case (12):
                    days = 31;
                    break;
                case (4):
                case (6):
                case (9):
                case (11):
                    days = 30;
                    break;
                case (2):
                    days = 28;
                    break;
                default:
                    days = -1;
                    break;
            }
            System.out.println("Number of Days in month: " + days);
            return days;
        }
    }
}