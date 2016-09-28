/* DT249 OOP
Lab week 3
Is unput greater than 5
Phillip Hourigan
D15124474 */

// import the Scanner class
import java.util.Scanner;

// create Great5 class
public class Great5{
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
		
		// condition statement checks to see if num1 var is greatet than 5 if true print message
		if(num1 > 5){
			System.out.println("The number is greater than five.");
		}// end if
		// if the above condition is false prints a message saying it is smaller
		else{
			System.out.println("The number is 5 or smaller.");
		}// end else
		
		
		
	}// end main
	
}// end Great