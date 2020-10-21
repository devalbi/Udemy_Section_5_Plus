package devalbi.udemy.Section_5.challenges;

import java.sql.SQLOutput;

public class SwitchChallenge {

    public static void main(String[] args){

        char test = 'A';
        switch (test) {
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
                System.out.println("Char was B");
                break;
            case 'C': case 'D' : case 'E':
                System.out.println("Char was " + test);
                break;
            default:
                System.out.println("Char not found");
                break;
    }
    }
}
