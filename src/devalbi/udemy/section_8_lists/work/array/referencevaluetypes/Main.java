package devalbi.udemy.section_8_lists.work.array.referencevaluetypes;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //VALUE TYPES
        //Given Space for value in memory
        int myIntValue = 10;
        //Copies value of myIntValue and assigns to it's own space in memory
        int anotherIntValue =  myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        //Shows the 2 value types have their own space/values in memory
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        //REFERENCE TYPES - OBJECTS - new keyword
        //Creating a new int object. Will be referenced in memory
        int[] myIntArray = new int[5];

        //declaring another array to the same reference in memory.
        //2 references to a single reference in memory.
        //As new keyword was not used for anotherArray, a new object was not created.
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        //Will change for both references as they both reference the same object.
        anotherArray[0] = 1;

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));


        //if object is changed in method, changed for both references.
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray = " + Arrays.toString(anotherArray));

        //Can reassign a reference to a new or initialised object.
        anotherArray = new int[] {1, 2, 3};

        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray = " + Arrays.toString(anotherArray));

    }

    public static void modifyArray(int[] array){
        array[0] = 2; //Changes value in array object.
        //this means Array reference is now referencing a new object.
        //Does not effect array passed in.
        array = new int[] {1, 2, 3, 4, 5};
    }
}
