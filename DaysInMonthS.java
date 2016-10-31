/* DT249 OOP
Lab week 3
How many days in a month
Phillip Hourigan
D15124474 */

// import the Scanner class
import java.util.Scanner;
import javax.swing.JOptionPane;


// create DaysInMonth class
public class DaysInMonthS{
	// create main method
	
	public static void main(String args[]){
		// creates an int array and assigns it 12 values
		int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};
		
		// instantiate the Scanner class to use System.in		
		Scanner input = new Scanner(System.in);
		
		// prompt user for an input
		String month = JOptionPane.showInputDialog("Enter a month ie 2 for feburary? ");
		// assign the input to a var theString
		//String theString = input.nextLine();
		// convert theString var to an int month
		int month2 = Integer.parseInt(month);
		// prints blank line to screen
		//System.out.println();
		
		// does the same as above block but with in var names
		String year = JOptionPane.showInputDialog("Enter a year ie 1984? ");
		//String theString2 = input.nextLine();
		int year2 = Integer.parseInt(year);
		//System.out.println();
		
		// condition if year remander is 0 AND year remander is not 0 OR year remander 400 is 0 it os true
		if(year2 % 4 == 0 && (year2 % 100 != 0 ||year2 % 400 == 0)){
			// changes array index 1 to 29
			monthArray[1] = 29;
		}//end if
		
		// displays a message saying how many days where in that month in the year 
		JOptionPane.showMessageDialog(null, "There are %d in that month in the year %d.\n", monthArray[month2 - 1], year2);
		
	}// end main
}// end DaysInMonth