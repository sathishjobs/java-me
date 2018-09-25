package Adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exists;

    public Location(int locationID, String description, Map<String,Integer> exists) {
        this.locationID = locationID;
        this.description = description;
        this.exists = new HashMap<String, Integer>();
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExists() {
        return new HashMap<String, Integer>(exists);
    }

    // add exist
//    public void addExit(String direction, int location){
//        exists.put(direction,location);
//    }

    public static void main(String[] args) {
        //write your code here
    }
}
