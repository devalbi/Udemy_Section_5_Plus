package devalbi.udemy.section_8_lists.work.array;

import javax.swing.*;
import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] intArray = getIntegers(5);
        printArray(intArray);
        System.out.println(getAverage(intArray));

        //creates new array with maxlength 10.
        //All objects stored in this are type int.
/*        int[] myIntArray = new int[25];*/
        //Can fill out like this but is time consuming.
/*      myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;*/

        //Arrays always start at position 0,
        //So 5 is actually position 6,
        //assigned value of 50 to position 6.
       /* myIntArray[5] = 50;
        System.out.println(myIntArray[5]);*/

        //Can use this to define length and data/objects.
        // Can only use when defining Array var.
 /*       int[] myIntArray2 ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray2[1]);
        System.out.println(myIntArray2[2]);
        System.out.println(myIntArray2[3]);
        System.out.println(myIntArray2[4]);*/

        //Can use for loop to initialize/add data.
        //best not to hard code value "i < 10;"
        //better to use array's length. - Otherwise risk OOB exceptions.
/*        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        printArray(myIntArray)*/;
    }

    //datatype being passed in is int[] - An int array
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    //takes in input and assigns
    //return type contains [] to ensure it is array.
    public static int[] getIntegers(int number){
        System.out.println("Enter "  + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            int value = scanner.nextInt();
            values[i] = value;
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }



}
