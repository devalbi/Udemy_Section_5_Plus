package devalbi.udemy.section_8_lists.work.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();

        addInOrder(placeToVisit, "Dublin");
        addInOrder(placeToVisit, "Galway");
        addInOrder(placeToVisit, "Cork");
        addInOrder(placeToVisit, "Belfast");
        addInOrder(placeToVisit, "Belfast");
        addInOrder(placeToVisit, "Wexford");
        addInOrder(placeToVisit, "Sligo");
        placeToVisit.add(1, "Bray");

        placeToVisit.remove(4); //Removes Index position 4
        printList(placeToVisit);

        visit(placeToVisit);
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
                return false;
            } else if(comparison > 0){
                //new city should appear before this element.
                //Galway --> Belfast(newCity) - Belfast should be put before galway but due to .next we have already passed galway.
                //Use .previous to go back before insertion.
                iterator.previous(); //unique to list iterator.
                iterator.add(newCity);
                return true;
            } else if (comparison < 0){
                //move onto next city.
                //Do not need to do anything here. .next() is above.
            }
        }
        iterator.add(newCity); // adds to end/tail of linkedList.
        return true; // Usually don't want to be a boolean/return and change something at the same time.
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; // checks to see if a double .next() is needed for iterator.
        ListIterator<String> iterator = cities.listIterator();

        //getFirst() gets first entry in list
/*        if(cities.getFirst() ==  null){ should not use it this way*/
        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
        } else {
            System.out.println("Now visiting " + cities.getFirst() );
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(iterator.hasNext()) { // checks if there is a element to go next to.
                            iterator.next(); // if was going backwards, then double next is needed.
                        }
                        goingForward = true;
                    }
                    if(iterator.hasNext()) {
                        System.out.println("now visiting " + iterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(iterator.hasPrevious()) {// checks if there is a element to go previous to.
                            iterator.previous(); // if was going forwards, then double previous is needed.
                        }
                        goingForward = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Now visiting " + iterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Press 0 to exit\n" +
                "Press 1 - for next city\n" +
                "Press 2 - for previous city\n" +
                "Press 3 - Print Menu Options");
    }
}



















