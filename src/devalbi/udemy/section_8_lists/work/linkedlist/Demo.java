package devalbi.udemy.section_8_lists.work.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();

        placeToVisit.add("Dublin");
        placeToVisit.add("Galway");
        placeToVisit.add("Cork");
        placeToVisit.add("Belfast");
        placeToVisit.add("Wexford");
        placeToVisit.add("Sligo");

        printList(placeToVisit);

        placeToVisit.add(1, "Bray");

        printList(placeToVisit);
        placeToVisit.remove(4); //Removes Index position 4

        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){ // Checks if there is another entry
            System.out.println("Now visiting: " + i.next()); //Moved to next entry
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> iterator = linkedList.listIterator();
        while(iterator.hasNext()){
            int comparison = iterator.next().compareTo(newCity); // compares to next element, returns an int, 0 if two params are the same
            if(comparison == 0){ //returns an int, 0 if two params are the same
                //equal, do not add
                System.out.println(newCity + " is already included as a destination.");
            } else if(comparison > 0){
                //new city should appear before this element.
                //Galway --> Belfast(newCity) - Belfast should be put before galway but due to .next we have already passed galway.
                //Use .previous to go back before insertion.
                iterator.previous(); //unique to list iterator.
                iterator.add(newCity);
                return true;
            } else if (comparison < 0){
                //move onto next city.
            }
        }
        iterator.add(newCity); // adds to end/tail of linkedList.
        return false;
    }
}



















