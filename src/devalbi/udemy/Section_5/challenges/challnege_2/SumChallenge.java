package devalbi.udemy.Section_5.challenges.challnege_2;

/*
Create a for statement using a range of numbers from 1 to 1000 inclusive.
Sum all the numbers that can be divided with both 3 and also with 5.

For those numbers that met the above conditions, print out the number.
break out of the loop once you find 5 numbers that met the above conditions.

After breaking out of the loop print the sum of the numbers that met the above conditions.
Note: Type all code in Main method
*/

public class SumChallenge {

    public static void main(String[] args) {
        int counter=0;
        int sum = 0;

        for ( int i = 1; i <= 1000; i++) {

             if ((i % 5 == 0) && (i % 3 == 0)) {
                 sum += i;
                 System.out.println(i + " is divisible by 3 and 5. Sum is now " + sum);
                 counter++;

                 if (counter == 5) {
                     System.out.println("5 numbers that are divisible by 3 and 5 have been found. \n" +
                             "Breaking from loop.");
                     break;
                 }
             }
         }
    }
}
