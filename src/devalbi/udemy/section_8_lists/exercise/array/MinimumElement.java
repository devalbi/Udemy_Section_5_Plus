package devalbi.udemy.section_8_lists.exercise.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private int[] intArray;

    public MinimumElement() {
        int numOfElements = readInteger();
        intArray = readElements(numOfElements);
        int minimumValue = findMin(intArray);

        System.out.println("Minummum value in Array is: " + minimumValue);

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements in the Array?");
        int elementsAmount = scanner.nextInt();
        scanner.nextLine();

        return elementsAmount;
    }

    private static int[] readElements(int elements) {
        //Write another method called readElements() that has one parameter of type int
        //The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the elements in the array");

        int[] arrayElements = new int[elements];

        for (int i = 0; i < arrayElements.length; i++) {
            System.out.println("Enter the next value");
            arrayElements[i] = scanner.nextInt();
            System.out.println("Element " + i + " is " + arrayElements[i]);
        }

        return arrayElements;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        int minimumValue = array[0];

        return minimumValue;
    }

}
/*
    Write a method called readInteger() that has no parameters and returns an int.

    It needs to read in an integer from the user - this represents how many elements the user needs to enter.


    And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.

    The scenario is:
            1. readInteger() is called.
            2. The number returned by readInteger() is then used to call readElements().
            3. The array returned from readElements() is used to call findMin().
            4. findMin() returns the minimum number.

            [Do not try and implement this. It is to give you an idea of how the methods will be used]
    TIP: Assume that the user will only enter numbers, never letters.
    TIP: Instantiate (create) the Scanner object inside the method.
    There are two scanner objects, one for each of the two methods that are reading in input from the user.
    TIP: Be extremely careful about spaces in the printed message.
    NOTE: All methods should be defined as private static.
    NOTE: Do not add a main method to the solution code.*/

