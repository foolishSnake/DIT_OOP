public class Book1{

	// Declare instance fields
	String name;
	int price
           String booktype;


	// The constructor initialises the instance fields
	Book1 (String n, int p,String bt) {
		name = n;
		price = p;
                             Booktype = bt;
	}

	// a method to output the object details
	void write() {
		System.out.println(name  + " for £" +price);
	}
}
