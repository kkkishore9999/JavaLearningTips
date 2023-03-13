package oops_concepts;

public class Static_Keyword {

	/**
	 * Static Keyword
	 * Static Members Belong to Class (Type) and not to Object
	 */
	
	
	//String name = "ABC";
	
	//Changing the variable or Method to Static. And they can be accessed using Static_Keyword class.
	static String name = "ABC";
	byte age = 6;
	String grade = "First";
	
	public void displayDetails() {
		
		System.out.println("Student name is " + name + " of age " + age + " has got " + grade + " grade");
		
	}
	
	public static void doThis() {
		System.out.println("Executing the static method");
		
	}
	
	
}
