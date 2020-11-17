package devalbi.udemy.Section_5.challenges.challnege_2;

/*
Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.
*/


public class SharedDigit {

    public static void main(String[] args) {
        SharedDigit s = new SharedDigit();

/*        s.hasSharedDigit(12, 23);
        s.hasSharedDigit(9, 99);
        s.hasSharedDigit(15, 55);*/
        s.hasSharedDigit(12, 23);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            System.out.println("Outside of Number Range");
            return false;
        }

        int compareNum1 = 0;
        int compareNum2 = 0;
        int secondLoopNum2 = num2;

        while (num1 > 0) {
            compareNum1 = num1 % 10;
            num1/=10;

            while (secondLoopNum2 > 0) {
                compareNum2 = secondLoopNum2 % 10;
                secondLoopNum2/=10;
                if (compareNum1 == compareNum2)
                {
                    System.out.println("Both numbers contain " + compareNum1);
                    return true;
                }
            }
            secondLoopNum2 = num2;
        }
        System.out.println("Numbers do not contain a match");
        return false;
    }
}
