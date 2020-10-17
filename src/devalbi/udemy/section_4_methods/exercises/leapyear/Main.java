package devalbi.udemy.section_4_methods.exercises.leapyear;

public class Main {

    public static void main(String[] args) {

        LeapYear l = new LeapYear();

        l.isLeapYear(-1600);
        l.isLeapYear(-1200);
        l.isLeapYear(1600);
        l.isLeapYear(2017);
        l.isLeapYear(2000);
    }

}
