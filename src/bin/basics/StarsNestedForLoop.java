package basics;

public class StarsNestedForLoop {

	public static void main(String[] args) {
		/**
		 * 		Write a program to create pattern:
		 * 	
		 * 		*	
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 		******
		 * 
		 * 
		 * Outer for - loop for Rows and Inner For Loop - Columns
		 * 
		 */
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}

}
