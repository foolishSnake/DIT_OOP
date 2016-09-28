/* DT249 OOP
Lab week 3
Add 2 input int together.
IntPlus.java
Phillip Hourigan
D15124474 */

// import the Scanner class
import java.util.Scanner;

// create IntPlus class
public class IntPlus{
	// create main method
	public static void main(String args[]){
		// instantiate the Scanner class to use System.in
		Scanner input = new Scanner(System.in);
		
		// prompt user for an input
		System.out.println("Enter an integer");
		// assign the input to a var theString
		String theString = input.nextLine();
		// convert theString var to an int num1
		int num1 = Integer.parseInt(theString);
		
		// does the same as above block but with in var names
		System.out.println("Enter an integer");
		String theString2 = input.nextLine();
		int num2 = Integer.parseInt(theString2);
		
		// adds var num1 and num2 and output result to screen
		System.out.println(num1 + num2);
		
		
	}// end main
	
}// end intPlus