package devalbi.udemy.section_8_lists.challenges.array.reversearray;

import java.util.Arrays;

public class ReverseArray {
/*  -Write a method called reverse() with an int array as a parameter.
    -The method should not return any value. In other words, the method is allowed to modify the array parameter.
    -In Main() test the reverse() method and print the array both reversed and non-reversed.
    -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
                -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

    Tip:
            -Create a new console project with the name eReverseArrayChallengef*/

    private int[] intArray;
    private int[] intArray2;

    public ReverseArray(){

        //Initializing array and filling in test data for even and odd numbers.
        intArray = new int[] {10, 15, 3, 23, 41};
        intArray2 = new int[] {10, 15, 3, 23, 41, 56};

        printArray(intArray);
        reverse(intArray);
        printArray(intArray);

        printArray(intArray2);
        reverse(intArray2);
        printArray(intArray2);
    }

    public void reverse(int[] array){

        //Loop only needs to run halfway through array,
        //and does not need to pass through mid value if array.length is an odd number.
        //that's why using math.floor, to prevent mid-value being run in loop.
        int loopValue = (int) Math.floor(array.length/2);
        int maxIndex = array.length - 1;
        int tempValue;
        int reverse;

        for(int i = 0; i < loopValue; i++){

            //Used to get opposite value for i to switch.
            reverse = maxIndex - i;

            //Swapping values.
            tempValue = array[i];
            array[i] = array[reverse];
            array[reverse] = tempValue;
        }

    }

    public void printArray(int[] array){
            System.out.println("Value of Array: " + Arrays.toString(array));
    }
}
