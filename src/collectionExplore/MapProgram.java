package collectionExplore;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("Java","a compiled high level, object-oriented, platform independent language");
        languages.put("Python","python description");
        languages.put("Algol","algol description");
        languages.put("Basic","beginners All prupose");
        languages.put("Lisp","THerein lies madness");

        System.out.println(languages.put("D","new java"));
        System.out.println("==============");
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","this course is about Java");
        }

    }
}
