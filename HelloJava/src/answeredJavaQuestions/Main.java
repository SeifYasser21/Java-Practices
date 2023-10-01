package answeredJavaQuestions;


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

        
        // Task 3: Add "Mazda" as the first item of "arrayA"
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
        
        // Display the original string before reversal process
        System.out.println("Task 10:");
        System.out.println("Original str: " + str);
        
        // Use the StringBuilder class and insert str string into the builder
        StringBuilder stringBuilder = new StringBuilder(str);
        
        // reverse str via stringBuilder
        stringBuilder.reverse();
        
        // Convert the reverseStr StringBuilder to a String and rename it to "str"
        str = stringBuilder.toString();
        System.out.println("Reversed str: " + str);
        System.out.println("----------------------------------------------------------------------------------------");
        
        // Task 11: Replace parts of a string
        // Initialize both the target string and replacement string
        String targetStr = "222";
        String replacementStr = "aaa";
        
        // Initialize the range of indexes needed to be replaced.
        int startingIndex = stringBuilder.lastIndexOf(targetStr);
        int endingIndex = startingIndex + targetStr.length();
        
        // Display the original string before reversal process
        System.out.println("Task 11:");
        System.out.println("Original str: " + str);
        
        // Use StringBuilder to undergo the replacement process for the specified range
        stringBuilder.replace(startingIndex, endingIndex, replacementStr);
        
        // re-initialize 'str' variable
        str = stringBuilder.toString();
        
        // Print the new 'str' string
        System.out.println("Replaced str: " + str);
        System.out.println("----------------------------------------------------------------------------------------");
        
        // ================================ QUESTION 2 ================================
    	System.out.println("====================================== QUESTION 2 ======================================");
    	
    	// Thought process:
    	// Considering that the two ints(1 & 2) produced the 3rd int.
    	// I deduced that the 3rd int was a multiplication of the 1st and 2nd int.
    	// However, the 4th was a bit misleading as is can be either multiplication or addition
    	// But the more I went through the sequence of numbers, I came to the conclusion that:
    	// The first 2 ints were multiplication, then 2nd int and 3rd int were addition, and the formula recycles from there.
    	// To implement that into code however, I used odd/even index positioning to determine if the next sequence was addition or multiplication
    	
    	// Initialize an array to store the numbers from the sequence
    	// I used 12 indexes for the array as it would give the next 5 sequences after the provided numbers.
    	int[] sequence = new int[12];
    	
    	// Set the first 2 indexes as the first 2 numbers provided in the question as favoured
        sequence[0] = 1;
        sequence[1] = 2;

        // Loop through the "sequence" array starting from index 2
        for (int i = 2; i < sequence.length; i++) {
        	// If the current index is an even number
            if (i % 2 == 0) {
                // Multiply the previous two items of the sequence
                sequence[i] = sequence[i - 2] * sequence[i - 1];
            } 
            // If the current index is NOT an even number
            else {
                // Add the previous two items of the sequence
                sequence[i] = sequence[i - 2] + sequence[i - 1];
            }
        }

        // Print the last 5 indexes of the sequence to provide the next 5 numbers of the provided sequence
        System.out.println("The next 5 numbers of the sequence:");
        for (int j = sequence.length - 5; j < sequence.length; j++) {
            System.out.println("Number " + (j + 1) + ": " + sequence[j]);
        }
        System.out.println("----------------------------------------------------------------------------------------");

    }
}


