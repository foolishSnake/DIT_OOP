import java.util.Scanner;

public class W4Fact{
	public static void main(String args[]){

    	int n1 = 0;
		int factorial;
		
		Scanner input = new Scanner(System.in);
		
		//prompt user for an input
		System.out.printf("Enter an interger value? ");
		// assign the input to a var theString
		String theString = input.nextLine();
		// convert theString var to an int side
		n1 = Integer.parseInt(theString);
		int startNum = n1;
		factorial = n1;
		if(n1 < 1){
			System.out.println("You have to enter a number greater than 0!");
		}// end if
		else{
			while(n1 > 1){
					n1 = n1 - 1;
					factorial = factorial * (n1);
			}// end while
			System.out.printf("The factorial of %d is %d",startNum, factorial);
		}// end else
		
	}// end main
}// end W4Fact