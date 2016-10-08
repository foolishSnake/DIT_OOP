import java.util.Scanner;
public class Sum1To10{
		
	public static void main(String args[]){
		int[] arrayInt = {1,2,3,4,5,6,7,8,9,10};
		int number = 1;
		int sumNum = 1;
		//int i = 0;
		System.out.println("This is a for loop summing 1 to 10");
		for(int i = 0; i < 10; i++){
			System.out.printf("%d + %d = %d\n",sumNum, number, sumNum + number);
			sumNum = sumNum + number;
			
		}// end for loop
		sumNum = 1;
		System.out.println("\nThis is a while loop summing 1 to 10");
		while(sumNum < 11){
			System.out.printf("%d + %d = %d\n",sumNum, number, sumNum + number);
			sumNum = sumNum + number;
		}// end while
		
		
		number = 1;
		sumNum = 1;
		System.out.println("\nThis is a do while loop summing 1 to 10"); 
 		do{
			System.out.printf("%d + %d = %d\n",sumNum, number, sumNum + number);
			sumNum = sumNum + number;
		}//end do while
		while(sumNum <=10);
	}// end main
}// end Sum1To10