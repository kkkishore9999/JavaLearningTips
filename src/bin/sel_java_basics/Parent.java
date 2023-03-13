package sel_java_basics;

public class Parent {

	public static void main(String[] args) {
		
		System.out.println("I started learning Java");
		
		//Add Two Numbers 2, 3 = 5.
		
		int num1 = 2;
		int num2 = 5;
		
		int sum = num1 + num2;
		
		System.out.println("Sum of Two Numbers: " + sum);
		
		
		//Write code to make sure, if header on website across all pages
		
			Methods m1 = new Methods();
			//ClassObject.MethodName
			m1.validateHeader();
		
			m1.successMessage();
			System.out.println(m1.successMessage());
		

	}

}
