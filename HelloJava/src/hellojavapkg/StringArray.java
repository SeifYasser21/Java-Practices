// 
package hellojavapkg;

// Imports
import java.util.ArrayList;
import java.util.List;


// Name of Class
public class StringArray {
	
	
    // Initialize a private field to store the string array
    private List<String> array;

    
    // Initialize the "StringArray" with an initial array
    public StringArray(String[] initialArray) {
        
    	// Create a new ArrayList to store the strings
        array = new ArrayList<>();
        
        // Copy the elements from initialArray into the newly made array
        for (String item : initialArray) {
            array.add(item);
        }
    }

    
    // Insert item by name
    public void insertByName(String itemName) {
    	
        // Add the item to the array's last slot/index
        array.add(itemName);
    }

    
    // Insert item by name for specific slot/index
    public void insertByIndex(int itemIndex, String itemName) {
    	
        // If the index is valid / acceptable by the array
        if (itemIndex >= 0 && itemIndex <= array.size()) {
        	
            // Insert the item at the specified index
            array.add(itemIndex, itemName);
            
        // If index isn't valid
        } else {
        	
            // Print an error message for an invalid index return
            System.out.println("ERROR: Invalid index.");
        }
    }

    
    // Remove item by name
    public void removeByName(String itemName) {
    	
        // Remove the first 
        array.remove(itemName);
    }
    
    
    // Get item by name
    public String getByName(String itemName) {
    	
    	// Loop through array to find the item
        for (String item : array) {
            if (item.equals(itemName)) {
                return itemName;
            }
        }
        // Return null after the loop (return nothing)
        return null;
    }
    
    
    // Get item by index
    public String getByIndex(int index) {
        if (index >= 0 && index < array.size()) {
            return array.get(index);
        } else {
            return null;
        }
    }


    
    // Fetch the array
    public List<String> getArray() {
    	
        // Return the array / ArrayList
        return array;
    }
}

