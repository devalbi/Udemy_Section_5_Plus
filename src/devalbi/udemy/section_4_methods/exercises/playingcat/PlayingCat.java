package devalbi.udemy.section_4_methods.exercises.playingcat;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if(summer) {
            return ((temperature >= 25) && (temperature <= 45)) ? true : false;
        } else {
            return ((temperature >= 25) && (temperature <= 35)) ? true : false;
        }
    }
}
