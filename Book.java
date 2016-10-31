public class Book {

	// Declare instance fields
	String name;
	int price;


	// The constructor initialises the instance fields
	Book (String n, int p) {
		name = n;
		price = p;
	}

	// a method to output the object details
	void write() {
		System.out.println(name  + " for £" +price);
	}
}
