package basics;

public class FibonacciSeries {

	public static void main(String[] args) {

		/*
		 * Find first 20 numbers of Fibionacci Series
		 * 
		 * 0 1 1 2 3 5 8 13
		 * 
		 */
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = 0;
		
		for(int i=0; i<=18; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			
			num2 = num3;
		}
	}

}
