package hellojavapkg;

// Java Imports
import java.util.Scanner;

public class hellojavaclass {
	
	public static void main(String[] args) {
		
		
//		// ======================PRINTING======================
//		// To Display Quotes "" within a string print
//		System.out.print("\"ok boss!\"");
//		
//		// To Display a backslash / And to print on another line IF not println
//		System.out.print("\n\\This is a sentence within 2 backslashes\\\n");
//		
//		// To print string in it's out line with println (Won't work if previous line is not println)
//		System.out.println("New Line baby");
//		
//		// To print int
//		System.out.println(1);
//		
//		
//		
//		// ======================VARIABLES======================
//		int asa; // Declaration
//		asa = 42; // Assignment
//		System.out.println(asa);
//		
//		int x = 3; // Initialization
//		System.out.println(x);
//		
//		// Using LONG, must add "L" at the end
//		long l = 1212121212121212121L;
//		
//		// Using FLOAT, must add "f" at the end
//		float f = 1.123456f;
//		
//		double d = 1.123456789876;
//		
//		boolean b = true;
//		
//		char c = 'C';
//		
//		String s = "Monkey D. Luffy";
//		
//		// Return variables with strings
//		System.out.println("It's " + x + " o'clock");
		
		
		// This scanner is to get user input
		Scanner scanner = new Scanner(System.in);
		
		// Input's question
		System.out.println("What is your name? ");
		
		// Initialized input into variable
		String name = scanner.nextLine();
		
		// Print the input with a statement
		System.out.println("Hello " + name + "!");
		
		
		
	}
}
