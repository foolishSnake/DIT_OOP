import java.util.Scanner;

public class LargestOf10{
	public static void main(String args[]){
		int[] arrayInt = new int[10];
		int largest = 0;
		
		// instantiate the Scanner class to use System.in
		Scanner input = new Scanner(System.in);
		
		// for loop to prompt user for int input and asssign to varable
		for(int i = 0; i < 10; i++){
			System.out.printf("Enter an interger?_ ");
			String theString2 = input.nextLine();
			int intInput = Integer.parseInt(theString2);
			arrayInt[i] = intInput;
			System.out.println();
		}// end for loop
		
		for(int j = 0; j < 10; j++){
			if (largest < arrayInt[j]){
				largest = arrayInt[j];
			}// end if
			
			
		}// end for loop
	// prints the largest int	
	System.out.printf("The largest int was %d",largest);
	}// end main
	
}// end LargestOf10