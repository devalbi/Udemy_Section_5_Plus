package devalbi.udemy.section_4_methods.challenge;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("John", 1500);
        displayHighScorePosition("Tara", 900);
        displayHighScorePosition("Sophie", 400);
        displayHighScorePosition("Peter", 50);

    }

    public static void displayHighScorePosition(String playerName, int score) {
        System.out.println("Player " + playerName + " managed to ger into position " +
                calculateHighScorePosition(score) + " on the high srore table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position;

        if (playerScore >= 1000) {
            position = 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            position = 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
