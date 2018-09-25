package Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> tempExit = new HashMap<String,Integer>();
        locations.put(0, new Location(0, "You are Sitting in from of a computer learning java",tempExit));
        locations.put(1, new Location(1, "This is first dude",tempExit));
        locations.put(2, new Location(2, "You are standing at the end of a road before a small brick building",tempExit));
        locations.put(3, new Location(3, "You are at the top of a hill",tempExit));
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        tempExit.put("W",2);
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        tempExit.put("Q",0);

        tempExit.put("Q",5);
        tempExit.put("Q",0);

        tempExit.put("N",1);
        tempExit.put("Q",0);

        tempExit.put("N",1);
        tempExit.put("W",2);
        tempExit.put("Q",0);

        tempExit.put("S",1);
        tempExit.put("W",2);
        tempExit.put("Q",0);

        Map<String,String> vocabulary = new HashMap<String,String>();

        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("WEST","W");
        vocabulary.put("EAST","E");



        int loc = 1;
        while (true) {
            String result = locations.get(loc).getDescription();
            if (result != null) {
                System.out.println(locations.get(loc).getDescription());
            } else {
                System.out.println("No description found");
            }
            if (loc == 0) {
                break;
            }
            Map<String,Integer> exists = locations.get(loc).getExists();
            System.out.println("Available exits are");
            for(String exit: exists.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if(exists.containsKey(direction)){
                loc = exists.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }

}
