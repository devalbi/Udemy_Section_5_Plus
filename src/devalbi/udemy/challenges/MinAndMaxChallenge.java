package devalbi.udemy.challenges;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            int maxNumber = 0, minNumber = 10;
            System.out.println("Enter Number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                while(number > 0){
                    int digit = number % 10;
                    number = number /10;
                    if(digit > maxNumber)
                    {
                        maxNumber = digit;
                    }
                    if(digit < minNumber){
                        minNumber = digit;
                    }
                }

            } else {
                System.out.println("Invalid Input");
                System.out.println("MinNum is: " + minNumber + ", MaxNum is: " +maxNumber );
                break;
            }
            System.out.println("MinNum is: " + minNumber + ", MaxNum is: " +maxNumber );
            scanner.nextLine();
        }
    }
}
