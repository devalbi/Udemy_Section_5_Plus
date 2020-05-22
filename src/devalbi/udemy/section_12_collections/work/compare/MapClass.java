package devalbi.udemy.section_12_collections.work.compare;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    public static void main(String[] args) {

        //Key and Value
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "OOO Language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "First language learned OOO Language");
        languages.put("Algol", "Algorithmic Language");

        //Will add K+V but will print Null, must be declared first
        //System.out.println(languages.put("BASIC", "Beginners All purpose sybmbolic instruction code"));
        //System.out.println(languages.put("Lisp", "Therin Lies Language"));
        languages.put("BASIC", "Beginners All purpose sybmbolic instruction code");
        languages.put("Lisp", "Therin Lies madness");


        //Same key, old value will be overwritten
        System.out.println(languages.put("Java", "Java OOO language"));
        /*System.out.println(languages.get("Java"));*/

        System.out.println("=================================================");

        //remove() returns true or false
       // languages.remove("Lisp"); //Only needs Key
        if(languages.remove("Algol", " a family of Algorithmic Language")) { //only removes if Key + Map matches condition
            System.out.println("Algo Removed");
        } else {
            System.out.println("Algo not removed, Key + Value pair not found.");
        }

        //Checks if key and old value match, if true, then replaces.
        //Key, Old Value, New Value
        if(languages.replace("Lisp","Therin Lies madness", "A functional Programming language")){
            System.out.println("Lisp is replaced");
        } else {
            System.out.println("Lisp is not replaced");
        }
        System.out.println(languages.replace("Scaler", "this will not be added"));

        //Unordered for hashMaps
        for (String key : languages.keySet()) {
            System.out.println(key + " " + languages.get(key));
        }




    }
}
