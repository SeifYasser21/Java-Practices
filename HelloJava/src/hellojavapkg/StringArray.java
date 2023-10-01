package hellojavapkg;

import java.util.Arrays;

public class StringArray {
	
	
	
    // Initialize a string array to begin storing items
    private String[] array;

    public StringArray(String[] startingArray) {
        array = startingArray;
    }

    
    
    // Create method to retrieve the stored private array (One Line at a time)
    public String[] getArray() {
        return array;
        }
    
    
    
    // Create static method that takes in an array and return it in a formatted way ["a","b","c"]
    public void getFormattedArray() {
    	// Print the beginning of the formatted array "["
        System.out.print("[");
        
        // Loop through each array item
        for (int i = 0; i < array.length; i++) {
        	
        	// Print array item
            System.out.print(array[i]);
            
            // If the current item isn't the last item of the array
            if (i < array.length - 1) {
            	
            	// Add separation between items
                System.out.print(", ");
            }
        }
        // Print the end of the formatted array "]"
        System.out.println("]");
    }



    
    
    
    // Create method for inserting a new item to the array (Only one item)
    public void addItem(String item) {
    	
        // Initialize the length of them new array (+1 of old array)
        int newLength = array.length + 1;
        
        // Make a copy of the old array with the new length
        String[] updatedArray = Arrays.copyOf(array, newLength);

        // Add the new item at the end of the array
        updatedArray[newLength - 1] = item;

        // Update the original array with the newly created updatedArray
        array = updatedArray;
        }

    
    
    // Create method for inserting item at specified index/slot (Only one item)
    public void addItemAtIndex(String item, int index) {
    	
    	// Initialize the length of them new array (+1 of old array)
        int newLength = array.length + 1;
        String[] updatedArray = new String[newLength];

        // Copy all elements BEFORE the specified index
        System.arraycopy(array, 0, updatedArray, 0, index);

        // Insert the new item at the specified index
        updatedArray[index] = item;

        // Copy all elements AFTER the specified index
        System.arraycopy(array, index, updatedArray, index + 1, array.length - index);

        // Update the original array with the newly created updatedArray
        array = updatedArray;
        }

    
    
    // Create method for combining two arrays into a new array
    public static String[] combineArrays(String[] array1, String[] array2) {
    	
    	// Initialize the length of them new array (add length of both provided arrays)
        int newLength = array1.length + array2.length;
        
        // Create new array with the previously declared new length
        String[] combinedArray = new String[newLength];

        // Copy all items from the first array (array1)
        System.arraycopy(array1, 0, combinedArray, 0, array1.length);

        // Copy all items from the second array (array2)
        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);
        
        // Return the new combined array
        return combinedArray;
        }
    }
