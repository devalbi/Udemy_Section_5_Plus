package devalbi.udemy.section_12_collections.challenge_2.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Main main = new Main();
        main.command();
    }

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }

    public void command() {
        // write code here
        Map<String, Integer> vocabulary = new HashMap<>(locations.get(1).getExits());

        Map<String, String> directions = new HashMap<>();
        directions.put("NORTH", "N");
        directions.put("SOUTH", "S");
        directions.put("EAST", "E");
        directions.put("WEST", "W");
        directions.put("QUIT", "Q");

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        Location location = locations.get(1);

        while(!quit){

            Map<String, Integer> locationExits = new HashMap<>(location.getExits());
            System.out.print("Available exits are ");
            for(String exit : location.getExits().keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println("");

            String nextLocation =  scanner.nextLine().toUpperCase();

            if(nextLocation.length() > 1) {
                String[] inputLocationWords = nextLocation.split(" ");
                for(String word : inputLocationWords) {

                    if( directions.containsKey(word) ) {
                        nextLocation = directions.get(word);
                        break;
                    }
                }
            }

            if(location.getExits().containsKey(nextLocation)){

               int locationID = location.getExits().get(nextLocation);
               location = locations.get(locationID);

                System.out.println(location.getDescription());

            } else {
                System.out.println("You cannot go in that direction \n");
            }

            if(nextLocation.equals("Q")) {
                quit = true;
                System.out.println("You are sitting in front of a computer learning Java");
                break;
            }

        }

    }
}