package hellojavapkg;

public class Main {

    public static void main(String[] args) {
    	
    	// ================================ QUESTION 1 ================================
    	System.out.println("====================================== QUESTION 1 ======================================");
    	
        // Task 1: Initialize arrayA with provided data
        StringArray arrayA = new StringArray(new String[]{"Honda", "Toyota", "Proton"});
        
        
        // Task 2: Add "Nissan" to "arrayA"
        arrayA.addItem("Nissan");

        // Print "arrayA" after adding "Nissan"
        System.out.println("Task 2:");
        System.out.println("Updated arrayA after adding Nissan:");
        arrayA.getFormattedArray();
        System.out.println("----------------------------------------------------------------------------------------");

        
        // Task 3: Add "Mazda" as the first element of "arrayA"
        arrayA.addItemAtIndex("Mazda", 0);

        // Print "arrayA" after adding "Mazda" at the beginning
        System.out.println("Task 3:");
        System.out.println("Updated arrayA after adding Mazda at the beginning:");
        arrayA.getFormattedArray();
        System.out.println("----------------------------------------------------------------------------------------");

        
        // Task 4: Create a new array "arrayB" with animal names
        String[] arrayB = {"Monkey", "Dog", "Pheasant"};

        // Combine "arrayA" and "arrayB" into a new array "combinedArray"
        String[] combinedArray = StringArray.combineArrays(arrayA.getArray(), arrayB);

        // Initialize arrayC with newly combined array
        StringArray arrayC = new StringArray(combinedArray);
        
        // Print out arrayC
        System.out.println("Task 4:");
        System.out.println("Combined arrayA and arrayB:");
        arrayC.getFormattedArray();
        System.out.println("----------------------------------------------------------------------------------------");
        
        
        // Task 5: Initialize mapC & mapD with given key-value pairs
        StringMap mapC = new StringMap();
        StringMap mapD = new StringMap();

        mapC.put("123", "Justin");
        mapC.put("456", "Owen");
        mapC.put("789", "Hugo");

        mapD.put("123", "George");
        mapD.put("555", "Jack");
        mapD.put("888", "Julian");
        
        
        // Task 6: Combine mapD into mapC
        mapC.combineMap(mapD);

        // Print the combined mapC
        System.out.println("Task 6:");
        System.out.println("Combined mapC:");
        mapC.printFormattedMap();
        System.out.println("----------------------------------------------------------------------------------------");
        
        
        // Task 7: Print out the reason why value "Justin" doesn't exist
        // Print the reason why "Justin" is no longer in the result
        System.out.println("Task 7:");
        System.out.println("Reason:");
        System.out.println("During the combination process, the value for key '123' in mapD overwrote the value with the same key in mapC.");
        System.out.println("This is because there can't be 2 identical keys in the same map.");
        System.out.println("----------------------------------------------------------------------------------------");

        
        // Task 8: Return values in mapC where key contains "5"
        // Return values in mapC where the key contains "5"
        System.out.println("Task 8:");
        System.out.println("Values where key contains '5':");
        mapC.printPairsByKeyChar("5");
        System.out.println("----------------------------------------------------------------------------------------");
        
        
        // Task 9: Remove map entries where the value contains the "o" character in “mapC”.
        // Remove map entries where the value contains "o" (case-insensitive)
        System.out.println("Task 9:");
        mapC.removePairsByValueChar("o");
        System.out.println("MapC after removing entries with 'o' in the value:");
        mapC.printFormattedMap();
        System.out.println("----------------------------------------------------------------------------------------");
        
        
        // Task 10: Reverse a string
        // Define str with provided string
        String str = "111222888222555";
        System.out.println("Task 10:");
        System.out.println("Original str: " + str);
        
        // Use the StringBuilder class and initialize the reversed str
        StringBuilder reverseStr = new StringBuilder();
        
        // Append str into StringBuilder reverseStr
        reverseStr.append(str);
        
        // reverse StringBuilder input1
        reverseStr.reverse();
        
        // Convert the reverseStr StringBuilder to a String and rename it to "str"
        str = reverseStr.toString();
        System.out.println("Reversed str: " + str);
        System.out.println("----------------------------------------------------------------------------------------");
    }
}

