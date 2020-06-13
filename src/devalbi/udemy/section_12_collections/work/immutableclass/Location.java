package devalbi.udemy.section_12_collections.work.immutableclass;

import java.util.HashMap;
import java.util.Map;

//1/4. final class prevents sub-classes from overwriting methods - immutable
public final class Location {

    //2/4. Makes these fields private and final to be immutable
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<String, Integer>(exits); //3/4. Creates copy to ref objects to help be immutable
        } else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }
    //4/4 No setter classes.

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
