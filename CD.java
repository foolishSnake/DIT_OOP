import java.util.*;

class CD{
	String  artist;
	ArrayList<String> song = new ArrayList<String>();
		
		public CD(String art){
			artist = art;
		}
		
		public static void setSong(CD obj){
			int quitVer = 0;	
			String theString;
			
			while(quitVer != 1){
			Scanner input = new Scanner(System.in);
			System.out.printf("Please enter the name of the song ?");
			theString = input.nextLine();
			obj.song.add(theString);
			System.out.println("Enter 0 to add another song or press 1 to quit! ");
			theString = input.nextLine();
			quitVer = Integer.parseInt(theString);
			}// end while	
		}// end setSong
	
	public static void main(String[] args){
		
		
		CD now = new CD("Mix");
		now.song.add("War Pigs");
		now.song.add("Homer");
		System.out.println(now.artist);
		System.out.println(now.song.get(0));
				for (String temp : now.song) {
			System.out.println(temp);
		}// end for 
		
		setSong(now);
		/*
		while(quitVer != 1){
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the name of the song ?");
		theString = input.nextLine();
		setSong(theString);
		System.out.println("Enter 0 to add another song or press 1 to quit! ");
		theString = input.nextLine();
		quitVer = Integer.parseInt(theString);
		
		}*/
		System.out.println(now.song);
		
		
	}// end main
}// end CD