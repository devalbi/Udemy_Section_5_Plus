package section_12_collections.work;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);
       // theatre.getSeats();
        if(theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is reserved.");
        }

        if(theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is reserved.");
        }

    }


}
