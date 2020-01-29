package devalbi.udemy.section_10_generics.work;

import devalbi.udemy.section_8_lists.work.array.Array;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDouble(items);
    }

    private static void printDouble(ArrayList<Integer> arrayList){
        for(int i : arrayList){
            System.out.println(i *2);
        }
    }
}
