package devalbi.udemy.section_12_collections.work.immutableclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in a forest"));

        Map<String, Integer> tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);

        tempExit = new HashMap<>();
        tempExit.put("N", 5);

        tempExit = new HashMap<>();
        tempExit.put("W", 1);

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("QUIT", "Q");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }

            System.out.println("Select new location: ");
            String direction = scanner.nextLine().toUpperCase();

            String[] words = direction.split(" ");
            for (String word : words) {
                if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
