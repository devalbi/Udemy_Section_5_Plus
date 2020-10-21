package devalbi.udemy.section_4_methods.exercises.playingcat;

import devalbi.udemy.section_10_generics.work.players.Player;

public class Main {

    public static void main(String[] args) {
        PlayingCat playingCat = new PlayingCat();

        playingCat.isCatPlaying(true, 10);
        playingCat.isCatPlaying(false, 36);
        playingCat.isCatPlaying(false, 35);
    }
}
