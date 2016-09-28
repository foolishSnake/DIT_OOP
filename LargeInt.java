/* DT249 OOP
Lab week 3
Largest Int
Phillip Hourigan
D15124474 */

// import the Scanner class
import java.util.Scanner;

// create LargeInt class
public class LargeInt{
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
		int num2 = Integer.parseInt(theString2);System.out.println("Enter an integer");
			
		// condition is num1 greater than num2		
		if(num1 > num2){
			// if condition is true than prints message
			System.out.printf("The first number %d is greater than the second number %d.\n",num1, num2);
		}// end if
		// if first condition is false will see if num1 is the same as num2
		else if(num1 == num2){
			System.out.printf("The first number %d is the same as the second number %d.\n",num1, num2);
		}// end else if
		// if all conditions are false runs the else
		else{
			// displays message 
			System.out.printf("The first number %d is smaller than the second number %d.\n",num1, num2);
		}// end else
		
		
		
	}// end main
	
}// end Largeint