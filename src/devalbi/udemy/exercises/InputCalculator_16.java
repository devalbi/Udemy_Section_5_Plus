package devalbi.udemy.exercises;

import java.util.Scanner;

public class InputCalculator_16 {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0l;
        int counter = 0;

        while (true){
            //System.out.println("Enter Number: "); Does not work in Udemy.
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                sum += scanner.nextInt();
                counter++;
                avg = Math.round((double) sum / counter);
            } else{
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
