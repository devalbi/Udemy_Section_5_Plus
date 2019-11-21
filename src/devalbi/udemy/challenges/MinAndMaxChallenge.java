package devalbi.udemy.challenges;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE, minNumber = Integer.MAX_VALUE;


        while (true) {
            System.out.println("Enter Number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                    if(number > maxNumber)
                    {
                        maxNumber = number;
                    }
                    if(number < minNumber){
                        minNumber = number;
                    }

            } else {
                System.out.println("Invalid Input");
                System.out.println("MinNum is: " + minNumber + ", MaxNum is: " +maxNumber );
                break;
            }
            System.out.println("MinNum is: " + minNumber + ", MaxNum is: " +maxNumber );
            scanner.nextLine();
        }

        scanner.close();
    }
}
