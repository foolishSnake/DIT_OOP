public class W4Rectangle{
	public static void top_bottom(){
		int width = 30;
		for(int i = 0; i < width; i++){
			System.out.printf("*");
		}// end for
		System.out.println();
		
	}// end top bottom
	
	public static void middle(){
		int width = 28;
				
		System.out.printf("*");
		for(int i = 0; i < width; i++){
			System.out.printf(" ");
		}// end for
		System.out.printf("*");
		System.out.println();
				
	}// end middle
	public static void main(String[] args){
		int height = 8;
		
		top_bottom();
		for(int i = 0; i < height; i++){
			middle();
		}// end for
		top_bottom();
		
		
	}// end main
}// end W4Rectangle
