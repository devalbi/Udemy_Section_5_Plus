package devalbi.udemy.section_4_methods.challenge.overloading;

public class SecondsAndMinutes {
    static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    static final int SINGLE_DIGITS = 10;

    public static String getDurationString(int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 60 )) {
           return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes /60;
        minutes = minutes % 60;

        String hourString = hours + "h";
        String minuteSting = minutes + "m";
        String secondString = seconds + "s";

        if(hours < SINGLE_DIGITS) {
            hourString = "0" + hourString;
        }

        if(minutes < SINGLE_DIGITS) {
            minuteSting = "0" + minuteSting;
        }

        if(seconds < SINGLE_DIGITS) {
            secondString = "0" + secondString;
        }

        return hourString + " " +
                minuteSting + " " +
                secondString;
    }


    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}
