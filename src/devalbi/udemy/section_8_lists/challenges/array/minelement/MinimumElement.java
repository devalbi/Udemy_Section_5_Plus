package devalbi.udemy.section_8_lists.challenges.array.minelement;

import java.util.Scanner;

public class MinimumElement {

    private int[] intArray;
    private static Scanner scanner = new Scanner(System.in);

    public MinimumElement(){

       int counter = setArrayMethod();
       intArray = readIntegers(counter);
       findMin(intArray);
    }

    public int setArrayMethod() {
        int arrayValue = 0;
        boolean flag = true;
        System.out.println("Enter the length of the Array.\r");

        while (flag) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                arrayValue = scanner.nextInt();
                scanner.nextLine();
                flag = false;
            } else {
                System.out.println("Please enter a valid number.");
            }
        }
        return arrayValue;
    }


    public int[] readIntegers(int number){
        int[] intArray = new int[number];

        for(int i = 0; i < intArray.length; i++){
            System.out.println("Enter the "+ (i + 1) +" value for the array.\r");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                intArray[i] = scanner.nextInt();
            } else {
                i--;
            }
            scanner.nextLine(); //Needed when using scanner.nextInt().
        }
        return intArray;
    }

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Value of " + i + " is " + array[i]);
        }
    }

    public int findMin(int[] array){
        int minValue = Integer.MAX_VALUE; //ensures that min value is a smallest int, as even the largest has to be less than or equal to this.
        int temp;
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0; i < array.length; i++){
                int value = array[i];

                if(value < minValue){
                      minValue = value;
                }
            }
            /*Unnecessary
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }*/
        }

        printArray(array);
        System.out.println("Minimum value of array is " + minValue);
        return minValue;
    }

}
