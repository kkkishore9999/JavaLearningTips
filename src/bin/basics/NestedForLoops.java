package basics;

public class NestedForLoops {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			System.out.println("Iteration outer loop: "+i);
			for(int j=1;j<=5;j++)
			{
				System.out.println("Iterating inner loop: "+j);
			}
		}
	 /*
	  * For each iteration of outer loop for 10 times, it will iterate inner loop 5 times	
	  */

	}

}
