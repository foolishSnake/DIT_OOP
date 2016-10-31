import java.util.*;

class CD{
	String  artist;
	ArrayList<String> song = new ArrayList<String>();
		
		public CD(String art){
			artist = art;
		}
	
	public static void main(String[] args){
		CD now = new CD("Mix");
		now.song.add("War Pigs");
		now.song.add("Homer");
		System.out.println(now.artist);
		System.out.println(now.song.get(0));
				for (String temp : now.song) {
			System.out.println(temp);
		}
		
	}// end main
}