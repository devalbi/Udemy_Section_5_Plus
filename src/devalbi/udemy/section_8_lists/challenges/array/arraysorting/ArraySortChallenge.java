package devalbi.udemy.section_8_lists.challenges.array.arraysorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySortChallenge {

    // Create a program using arrays that sorts a arraylist of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.

    private Integer[] intArray;
    private Integer[] sortedIntArray;
    private Integer[] sortedIntArray2;
    Scanner sc = new Scanner(System.in);


    public ArraySortChallenge(){
        intArray = getIntegers(5);
        printArray(intArray);
       // sortedIntArray = sortIntegers(intArray);
        sortedIntArray2 = sortIntegers2(intArray);
       // printArray(sortedIntArray);
        printArray(sortedIntArray2);
    }

    //Takes User input and defines Array max and creates it.
    // getIntegers returns an array of entered integers from keyboard
    public Integer[] getIntegers(int number){
        System.out.println("Please enter " + number + " numbers:\r");
        Integer[] values = new Integer[number];
        for(int i = 0; i < values.length; i++)
        {
           values[i] = sc.nextInt();
        }
        return values;
    }

    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    public Integer[] sortIntegers(Integer[] array){
        Integer[] sortedArray = new Integer[array.length];
        Arrays.sort(intArray, Collections.reverseOrder());
        for(int i =0; i < sortedArray.length; i++){
            sortedArray[i] = intArray[i];
        }
        return sortedArray;
    }

    //Tim's way of doing it.
    //if [i] is smaller than [i+1] then swap them by storing [i] temporarily and then swapping both.
    public Integer[] sortIntegers2(Integer[] array){

        //Mor optimized way is to use in built class
        Integer[] sortedArray = Arrays.copyOf(array, array.length);
/*        Integer[] sortedArray = new Integer[array.length];
        for(int i =0; i < sortedArray.length; i++){
            sortedArray[i] = intArray[i];
        }*/
        boolean  flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i <sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    // printArray prints out the contents of the array
    public void printArray(Integer[] array){
        for(int i = 0; i < array.length; i++)
            {
                System.out.println("Entry: " + i + " has value of: " + array[i]);
            }
    }

}
