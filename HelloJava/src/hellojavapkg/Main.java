package hellojavapkg;

//Java Imports

public class Main {

	public static void main(String[] args) {
		
		// BULLET POINT 1
		// Initialize String[] arrayA with provided data
        String[] arrayA = {"Honda", "Toyota", "Proton"};

        // Create a StringArray object with the initialized array
        StringArray arrayA1 = new StringArray(arrayA);
        
        // BULLET POINT 2
        // Insert 'Nissan' item into the string array using the insertByName method
        arrayA1.insertByName("Nissan");
        String Nissan = arrayA1.getByName("Nissan");
        System.out.println("Newly Inserted Element: " + Nissan);
        
        
        // BULLET POINT 3
        // Insert item "Mazda" as first element
        arrayA1.insertByIndex(0, "Mazda");
        
        // Initialize variable "Mazda" and retrieve the first element. Then print message with item
        String Mazda = arrayA1.getByIndex(0);
        System.out.println("New First Element: " + Mazda);
        
        
        // BULLET POINT 4 ---------------------- START HERE !!!

        // Print the updated array
//        System.out.println("Updated arrayA:");
//        for (String item : newArrayA1.getArray()) {
//            System.out.println(item);
//        }
    }
}
