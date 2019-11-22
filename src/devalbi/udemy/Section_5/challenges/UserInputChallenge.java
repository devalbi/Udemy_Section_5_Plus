package devalbi.udemy.Section_5.challenges;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10){
            System.out.println("Enter Number #" + counter +": ");
            boolean hasNextInt =  scanner.hasNextInt();
            if(hasNextInt){
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Input, please try again");
            }
            //Will not catch in else if only in if statement. This prevents duplication of code.
            scanner.nextLine();
        }

        System.out.println(" The sum of the numbers is: " + sum);
        scanner.close();

/*      //Can also do it like so
        //Keeps looping until breaks out with "break;"
        while(true){
            System.out.println("Enter Number #" + counter +": ");
            boolean hasNextInt =  scanner.hasNextInt();
            if(hasNextInt){
                numbers += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Input, please try again");
            }
            if(counter == 10){
                break;
            }
            scanner.nextLine();
        }
*/

    }
}
