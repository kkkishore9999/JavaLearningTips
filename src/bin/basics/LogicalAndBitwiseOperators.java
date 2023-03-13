package basics;

public class LogicalAndBitwiseOperators {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		//AND - && Operator
		System.out.println(a && b);
		
		//OR - || Operator
		System.out.println(a || b);
		
		//NOT - ! Operator
		System.out.println(!b);
		System.out.println(!a);

		// Bitwise Operators
		// AND - &
		// OR - |
		// Compliment - ~
		
		int num1 = 60;
		int num2 = 42;
		
		System.out.println(num1 & num2);
		
		System.out.println(num1 | num2);
		
		System.out.println(~num1);
		System.out.println(~num2);
		
	}

}
