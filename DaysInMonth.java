/* DT249 OOP
Lab week 3
How many days in a month
Phillip Hourigan
D15124474 */

// import the Scanner class
import java.util.Scanner;

// create DaysInMonth class
public class DaysInMonth{
	// create main method
	public static void main(String args[]){
		// creates an int array and assigns it 12 values
		int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};
		
		// instantiate the Scanner class to use System.in		
		Scanner input = new Scanner(System.in);
		
		// prompt user for an input
		System.out.printf("Enter a month ie 2 for feburary? ");
		// assign the input to a var theString
		String theString = input.nextLine();
		// convert theString var to an int month
		int month = Integer.parseInt(theString);
		// prints blank line to screen
		System.out.println();
		
		// does the same as above block but with in var names
		System.out.printf("Enter a year ie 1984? ");
		String theString2 = input.nextLine();
		int year = Integer.parseInt(theString2);
		System.out.println();
		
		// condition if year remander is 0 AND year remander is not 0 OR year remander 400 is 0 it os true
		if(year % 4 == 0 && (year % 100 != 0 ||year % 400 == 0)){
			// changes array index 1 to 29
			monthArray[1] = 29;
		}//end if
		
		// displays a message saying how many days where in that month in the year 
		System.out.printf("There are %d in that month in the year %d.\n", monthArray[month - 1], year);
		
	}// end main
}// end DaysInMonth