package oops_concepts;

public class Method_Overloading {

	/*
	 * Method Overloading
	 * In side the class, 
	 * We can methods with same name, but differ with type/num/order of arguments.
	 * 
	 * 
	 */
	
			
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
		
	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	public void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}

	
	public void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	
	
}
