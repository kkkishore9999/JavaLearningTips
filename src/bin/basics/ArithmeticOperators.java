package basics;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 110;
		
		int mul = num1 * num2;
		
		int sum = num1 + num2 ;
		
		int sub = num1 - num2;
		
		int div = num1 / num2;
		
		int mod = num1 % num2;
		
		System.out.println(sum);
		
		System.out.println(sub);
		
		System.out.println(mul);

		System.out.println(div);
		
		System.out.println(mod);
		
		// Increment
		System.out.println("num1: "+num1);
		num1++;
		num1 = num1 + 1;
		System.out.println("Incr num1: " + num1 );
		
		//Decrement
		System.out.println("num2: "+num2);
		num2--;
		num2 = num2 - 1;
		System.out.println("Decr num2: " + num2 );
		
		// Increment
		System.out.println("-- num1: "+num1);
		num1+=5;
		num1 = num1 +5;
		System.out.println("-- Incr num1: " + num1 );
		

		// Increment
		System.out.println("-- num1: "+num1);
		num1-=5;
		num1 = num1 - 5;
		System.out.println("-- Decr num1: " + num1 );
		
		// Multiply
		System.out.println("-- num1: "+num1);
		num1*=5;
		num1 = num1 * 5;
		System.out.println("** Mul num1: " + num1 );
		
		//Divide
		System.out.println("-- num1: "+num1);
		num1/=5;
		num1 = num1 / 5;
		System.out.println("// Div num1: " + num1 );
		
		
		
	}

}
