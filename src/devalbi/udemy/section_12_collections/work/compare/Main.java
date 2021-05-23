package devalbi.udemy.section_12_collections.work.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Theatre theatre = new Theatre("Olympian", 8, 12);
                // List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);


                //reserving same seat for different arraylists (shallow copy here)
                //Proves shallow list is a reference to the same lists
                if(theatre.reserveSeat("D12")){
                    System.out.println("Please Pay for D12");
                } else {
                    System.out.println("Seat is already reserved");
                }

                if(theatre.reserveSeat("D12")){
                    System.out.println("Please Pay for D12");
                } else {
                    System.out.println("Seat is already reserved");
                }

                if(theatre.reserveSeat("B13")){
                    System.out.println("Please Pay for B13");
                } else {
                    System.out.println("Seat is already reserved");
                }

                List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
                Collections.reverse(reverseSeats);
                printList(reverseSeats);

                List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
                priceSeats.add(theatre.new Seat("B00", 13.00));
                priceSeats.add(theatre.new Seat("A00", 13.00));
                Collections.sort(priceSeats, Theatre.PRICE_ORDER);

            }
        });

        thread.start();

       /* Theatre theatre = new Theatre("Olympian", 8, 12);
       // List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);


        //reserving same seat for different arraylists (shallow copy here)
        //Proves shallow list is a reference to the same lists
        if(theatre.reserveSeat("D12")){
            System.out.println("Please Pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }

        if(theatre.reserveSeat("D12")){
            System.out.println("Please Pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("Please Pay for B13");
        } else {
            System.out.println("Seat is already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);*/

    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() +" "+ seat.getPrice());
        }
        System.out.println();
        System.out.println("=======================================");
    }

}
