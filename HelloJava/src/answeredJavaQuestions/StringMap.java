package answeredJavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class StringMap {

    // Define a private map variable to store key-value pairs as a HashMap.
    private Map<String, String> map = new HashMap<>();

    // Create method to combine a provided map into the original map
    public void combineMap(StringMap map2) {
        // Use the putAll method to add all key-value pairs from the provided map into this map
        map.putAll(map2.getMap());
    }

    // Create method to retrieve the private map
    public Map<String, String> getMap() {
        return map;
    }
    
    // Create method to print a given map normally (per line) - Currently Not In Use
    public void printMap() {
    	
    	// Loop through the given map for each entry
        for (Map.Entry<String, String> entry : map.entrySet()) {
        	
            // Print each key-pair value in key:value format
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Create method to print a given map in a readable manner
    public void printFormattedMap() {
    	
    	// Print the beginning of the formatted map "["
        System.out.print("[");
        
        // Define a boolean variable to check for the first key-value pair. Set as "true"
        boolean firstPair = true;
        
        // Loop through given map for each key-pair value entry
        for (Map.Entry<String, String> entry : map.entrySet()) {
        	
        	// If the current entry isn'the first pair
            if (!firstPair) {
            	
            	// Create space between pairs
                System.out.print(", ");
            }
            
            // Print the key-value pair entry in a readable format (["a":"b"])
            System.out.print("\"" + entry.getKey() + "\": \"" + entry.getValue() + "\"");
            
            // Set the firstPair boolean variable as false since the first pair has been iterated through.
            firstPair = false;
        }
        
        // Print the end of the formatted map "]"
        System.out.println("]");
    }

    // Create method to print values where the key contains a specific character
    public void printPairsByKeyChar(String character) {
    	
    	// Define a boolean variable that tracks the key search. Set as 'false'
    	boolean keyExists = false;
    	
    	// Loop through the map for each entry
        for (Map.Entry<String, String> entry : map.entrySet()) {
        	
            // If the entry's key contains the specified character
            if (entry.getKey().contains(character)) {
            	
            	// Print the key's value and set the tracker as 'true'
                System.out.println(entry.getValue());
                keyExists = true;
            }
        }
        
        // After the for loop is completed, if the keyExists is still false
        if (!keyExists) {
        	
        	// Print message
        	System.out.println("No keys containing given character.");
        }
    }

    // Create method to remove pairs where the value contains a specific character
    public void removePairsByValueChar(String character) {
        // Use removeIf to remove entries if the value contains the given character
        map.entrySet().removeIf(entry -> entry.getValue().toLowerCase().contains(character.toLowerCase()));
    }

    // Create method to insert a key-value pair into the map
    public void put(String key, String value) {
        // Use the put method to insert or update a key-value pair in the map
        map.put(key, value);
    }
}
