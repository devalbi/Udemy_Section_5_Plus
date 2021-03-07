package devalbi.udemy.section_8_lists.exercise.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private int[] sortedArray;

    public SortedArray (Integer arraySize) {
        sortedArray = getIntegers(arraySize);
        sortedArray = sortIntegers(sortedArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int arraySize) {
        //getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
        Scanner scanner = new Scanner(System.in);
        int[] sortedArray = new int[arraySize];

        for (int i=0; i<sortedArray.length; i++) {
            System.out.println("Enter the next value in the Array");
            sortedArray[i] = scanner.nextInt();
        }
        return sortedArray;
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        //sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers
        Arrays.sort(unsortedArray);
        int[] sortedArray =  new int[unsortedArray.length];
        int y = 0;

        for (int i = unsortedArray.length; i>0; i--) {
            sortedArray[y] = unsortedArray[i-1];
            y++;
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
