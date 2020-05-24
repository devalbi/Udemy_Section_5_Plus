package devalbi.udemy.section_12_collections.work.immutableclass;

import java.util.HashMap;
import java.util.Map;

public class Location {
    //Makes these field immutable
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;
        this.exits.put("Q", 0);
    }

    //can remove as exits added when class is initialized.
    //Helps with making class immutable
    /*public void addExit(String direction, int location){
        exits.put(direction, location);
    }*/

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //creates new hashmap with exits mapping
    //Stops outside classes from altering the exists list
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

}
