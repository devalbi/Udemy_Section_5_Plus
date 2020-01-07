package devalbi.udemy.section_8_lists.work.linkedlist;

import devalbi.udemy.section_8_lists.work.array.Array;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LinkedListCustomer customer = new LinkedListCustomer("Tim", 54.96);
        LinkedListCustomer anotherCustomer = customer;
        anotherCustomer.setBalance(12.12); // both references look at same memory address aka object in memory.

        System.out.println("Balance for customer " + customer.getName() + " is $" + customer.getBalance() );

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(3);
        intList.add(4);
        intList.add(5);

        for(int i = 0; i < intList.size() ; i++){
            System.out.println(i + ": " + intList.get(i));
        }

        //Inserts into index position 1, value 2
        intList.add(1, 2);

        for(int i = 0; i < intList.size() ; i++){
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
