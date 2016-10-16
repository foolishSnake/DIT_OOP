/*imports Scanner library for user inputs*/
import java.util.Scanner;

public class Person{
	/**
	 * Sets up a Person class with 2 fields 'name' and 'age'
	 * @param None
	 * @return None
	 */
	
	String name;
	int age;
	
	public Person(String name){
		/**
		 * Person take in one argument 'name' it's value is initialized to the class field
		 * Default value of class field 'age' is initialized as 0
		 * @param 'name' type String, class variable 
		 * @return None
		 */
		this.name = name;
		this.age = 0;
		
	}// end Person
	
	public static void observer(){
		/**
		 * observer does nothing at the moment
		 * @param None
		 * @return None
		 */
		
	}// end observer

	public static void display(String name1, int age1, String name2, int age2){
		/**
		 * display takes 4 aruments name and age for each person.
	     * will print to screen the details of each person
	     * will print the return string from the test_age method
		 * @param 'name1' type String, is the name value of the first person
		 * @param 'name2' type String, is the name value of the second person
		 * @param 'age1' type int, is the are value of the first person
		 * @param 'age2' type int, is the age value of the second person
		 * @return None
		 */
		System.out.printf("The name of person 1 is %s they are %d years of age\n",name1, age1);
		System.out.printf("The name of person 1 is %s they are %d years of age\n",name2, age2);
		System.out.println(test_age(name1, age1, name2, age2));
		
	}// end diplay
		
	public static void set_age(Person personData){
		/**
		 * set_age set a value to the class field 'age'
		 * takes an input from user and sets value to 'age' field
		 * uses the the class field 'name' in the prompt message
		 * @param 'personData' type Object Person, has two fields 'name' and 'age' 
		 * @return None
		 */
		Scanner input = new Scanner(System.in);
		System.out.printf("%s Please enter an interger for your age ",personData.name);
		String theString = input.nextLine();
		int intInput = Integer.parseInt(theString);
		personData.age = intInput;
		
	}// end set_age
	
	public static String test_age(String name1, int age1, String name2, int age2){
		/**
		 * test_age will test to see who is oldest of two persons
		 * @param 'name1' type String, used in prompts 
		 * @param 'age1' type int, tested in the condictions statements
		 * @param 'name2' type String, used in prompts
		 * @param 'age2' type int, tested in the condictions statements
		 * @return type String, will depend on the outcome of the condictional statement
		 */
		if(age1 > age2){
			return String.format("The oldest of %s and %s is %s at %d years of age!\n ",name1, name2, name1, age1);
		}// end if
		else if(age2 > age1){
			return String.format("The oldest of %s and %s is %s at %d years of age!\n ",name1, name2, name2, age2);
		}// end else if
		else{
			return String.format("%s and %s are the same age at %d years of age", name1, name2, age1);
		}// end else{
		
	}// end test age
	
	public static void main(String[] args){
		/**
		 * main method, instantiates 2 objests 'person1' and 'person2'
		 * passes the person objects to the set_age method
		 * calls the display method to print to screen object details
		 * @param None 
		 * @return None
		 */
		
		Person person1 = new Person("Bob"); // instantiates person1 with the name 'Bob'
		Person person2 = new Person("Sam"); // instantiates person1 with the name 'Sam'
		set_age(person1); // passes person1 to set_age
		set_age(person2); // passes person2 to set_age
		display(person1.name, person1.age, person2.name, person2.age); // passes person values to display information about them
	}// end main
}// end Person Class