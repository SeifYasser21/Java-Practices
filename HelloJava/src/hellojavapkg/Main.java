package hellojavapkg;

public class Main {

    public static void main(String[] args) {
        // Task 1: Initialize arrayA with provided data
        StringArray arrayA = new StringArray(new String[]{"Honda", "Toyota", "Proton"});
        
        // Task 2: Add "Nissan" to "arrayA"
        arrayA.addItem("Nissan");

        // Print "arrayA" after adding "Nissan"
        System.out.println("Task 2: Updated arrayA after adding Nissan:");
        arrayA.getFormattedArray();
        System.out.println("--------------------------------------------");

        // Task 3: Add "Mazda" as the first element of "arrayA"
        arrayA.addItemAtIndex("Mazda", 0);

        // Print "arrayA" after adding "Mazda" at the beginning
        System.out.println("Task 3: Updated arrayA after adding Mazda at the beginning:");
        arrayA.getFormattedArray();
        System.out.println("--------------------------------------------");

        // Task 4: Create a new array "arrayB" with animal names
        String[] arrayB = {"Monkey", "Dog", "Pheasant"};

        // Combine "arrayA" and "arrayB" into a new array "combinedArray"
        String[] combinedArray = StringArray.combineArrays(arrayA.getArray(), arrayB);

        // Initialize arrayC with newly combined array
        StringArray arrayC = new StringArray(combinedArray);
        
        // Print out arrayC
        System.out.println("Task 4: Combined arrayA and arrayB:");
        arrayC.getFormattedArray();
        System.out.println("--------------------------------------------");
      
    }
    		
}

