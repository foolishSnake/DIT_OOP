/* DT249 OOP
Lab week 3
Type of triangle
Phillip Hourigan
D15124474 */

// import the Scanner class
import java.util.Scanner;

// create TriangleType class
public class TriangleType{
	// create main method
	public static void main(String args[]){
		// instantiate the Scanner class to use System.in
		Scanner input = new Scanner(System.in);
		
		// prompt user for an input
		System.out.printf("Enter the lenght of the triangle side 1? ");
		// assign the input to a var theString
		String theString = input.nextLine();
		// convert theString var to an int side
		int side1 = Integer.parseInt(theString);
		// prints blank line to screen
		System.out.println();
		
		// does the same as above block but with in var names
		System.out.printf("Enter the lenght of the triangle side 2? ");
		String theString2 = input.nextLine();
		int side2 = Integer.parseInt(theString2);
		System.out.println();
		
		// does the same as above block but with in var names
		System.out.printf("Enter the lenght of the triangle side 3? ");
		String theString3 = input.nextLine();
		int side3 = Integer.parseInt(theString3);
		System.out.println();	
			
		// condition if side1 = side2 AND side1 = side3 triangle is equilateral	
		if((side1 == side2) && side1 == side3){
			// display message saying triangle is equilateral
			System.out.printf("This is an equilateral triangle as side 1 is %d , side 2 is %d and side 3 is %d are all the same size.\n",side1, side2, side3);
		}// end if
		// if first condition is false, cheaks if the sides are differant lenghts
		else if((side1 != side2) && (side1 != side3) && (side2 != side3)){
			//if else if condition is true than triangle is scalene
			System.out.printf("This is a scalene triangle as side 1 is %d , side 2 is %d and side 3 is %d are not the same size.\n",side1, side2, side3);
		}// end else if
		// if both above conditions are false this condition will run
		else{
			// displays message saying that the triangle is isosceles
			System.out.printf("This is an isosceles triangle as two of sides are the same size.\n");
		}// end else
		
		
		
	}// end main
	
}// end Largeint