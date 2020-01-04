package devalbi.udemy.section_8_lists.work.boxing;

import devalbi.udemy.section_8_lists.work.array.Array;

import java.util.ArrayList;

public class Boxing {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        //Works as String is a class
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Arron");

        //Does not work as cannot accept primitive type
      /*  ArrayList<int> intArrayList = new ArrayList<int>();*/

        //Could create class to use for ints -
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(10));

        //But already have a wrapper class for most primitive types
        //Can use this for ArrayList instead.
        Integer integer = new Integer(10);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10 ; i++){
            //i is an int, but converted to Integer for the arraylist
            //This is AutoBoxing
            //integerArrayList.add(Integer.valueOf(i)); //This is unnecessary as Java will do this automatically/
            integerArrayList.add(i);
        }

        for(int i = 0; i < 10 ; i++){
            //i is converted from an Integer to an int using valueOf(), From ArrayList type to primitive type int.
            //Un
            //This is Unboxing
           // System.out.println(i + " --> " + Integer.valueOf(i)); //This is unnecessary as Java will do this automatically/
            System.out.println(i + "--> " + i);
        }

        //During compile what is done is
        //Integer myIntValueCompile  = Integer.valueOf(56); //Done at compile time
        Integer myIntValue = 56; //AutoBoxing: primitive -> Class
        int myInt = myIntValue; //Unboxing: Class -> primitive
        //myInt.intValue(myIntValue); What Java is doing for unboxing


    }
}

//This is a created wrapper class that we created
//In reality not needed as Integer does this.
class IntClass{
    private int intValue;

    public IntClass(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
