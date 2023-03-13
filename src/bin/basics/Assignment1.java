package basics;

public class Assignment1 {

	public static void main(String[] args) {
		/*
		 * Find Biggest of Three Numbers 
		 * int num1, num2, num3
		 * 100, 400, 300
		 * 
		 * 
		 */

		int num1 = 100;
		int num2 = 400;
		int num3 = 300;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("num1 is bigger");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("num2 is bigger");
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println("num3 is bigger");
		}
		
	}

}
