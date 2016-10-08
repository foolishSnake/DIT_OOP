public class W4Count10{
	
	public static void main(String args[]){
		int[] list = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < i; j++){
				System.out.printf("%d",list[j]);
			}// end nested for
			System.out.println();
		}// end for
		
	}// end main
}// end W4Count10