package devalbi.udemy.section_12_collections.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        //reserving same seat for different arraylists (shallow copy here)
        //Proves shallow list is a reference to the same lists
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Please Pay for A02");
        } else {
            System.out.println("Seat is already reserved");
        }

        //Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy); // creates random order
        System.out.println("Printing seatCopy List");
        printList(seatCopy);
        System.out.println("Printing theatre.seats list (Original)");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println(minSeat.getSeatNumber() + " is the min seat in collection");
        System.out.println(maxSeat.getSeatNumber() + " is the max seat in collection");

        sortList(seatCopy);
        System.out.println("Printing sortedOrder List");
        printList(seatCopy);


    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=======================================");
    }

    //This is bubble sort.
    //Slower than merge sort but consumes less memory.
    public static void sortList(List<? extends Theatre.Seat> list){
        for(int i =0; i<list.size() -1 ; i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }

}
