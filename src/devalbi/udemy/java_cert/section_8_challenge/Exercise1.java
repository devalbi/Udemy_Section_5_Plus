package devalbi.udemy.java_cert.section_8_challenge;

public class Exercise1 {

    /*
    *Exercise1
    * You have been asked to develop a new computer game called, Card Busters!!!
    * There are two players playing the game.
    * Both players are given seven cards each.
    * Here are the values of player one’s cards. 10,6,8,9,7,12,7
    * Here are the values of playertwo’s cards. 7,6,9,5,2,8,11
    *
    * There are seven rounds in the game.
    *
    * Each round, the value of the players’ cards for that particular round are compared to see who has the highest valued card.
    * The player with the highest value card wins the round.
    *
    * For example, in round 1,
    * player one will play a card with a value of 10.
    * Player two will play a card with a value of 7.
    *
    * Player one wins the round.
    * If both cards have the same value, it is a tie.
    *
    * At the end of the game (after seven rounds),
    * the program should determine which player has won the gameoverall (won the most rounds)
    * or if the game has ended in a tie
    * */

    public static void main(String[] args) {

        int[] player1 = new int[]{10, 6, 8, 9, 7, 12, 7};
        int[] player2 = new int[]{7, 6, 9, 5, 2, 8, 11};
        int player1Wins = 0;
        int player2Wins = 0;

        for (int i = 0; i < player1.length; i++) {

            if (player1[i] > player2[i]) {

                System.out.println("Player 1 wins game of " + player1[i] + " to " + player2[i] + ".");
                player1Wins++;

            } else if (player1[i] < player2[i]) {

                System.out.println("Player 2 wins game of " + player2[i] + " to " + player1[i] + ".");
                player2Wins++;

            } else {

                System.out.println("Game was a tie with " + player1[i] + " and " + player2[i]);

            }
        }

        if (player1Wins > player2Wins) {

            System.out.println("Player One wins!!! " +
                    " Winning " + player1Wins +
                    " compared to Player 2 " + player2Wins +
                    "wins.");

        } else if (player1Wins < player2Wins) {

            System.out.println("Player Two wins!!! " +
                    " Winning " + player2Wins +
                    " compared to Player 1 " + player1Wins +
                    "wins.");

        } else {

            System.out.println("It is a tie with player 1 winning " +
                    " " + player1Wins +
                    " games compared to Player 2's " + player2Wins +
                    "wins.");

        }
    }
}
