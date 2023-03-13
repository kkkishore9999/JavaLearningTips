package string_operations;

public class StringSlice {

	public static void main(String[] args) {
		
		/*
		 * Methods:
		 * Char At
		 * SubString
		 * Split
		 * 
		 */

		String str1 = "ABCDEF";
		
		//CharAt
		System.out.println(str1.charAt(5));
		
		//System.out.println(str1.charAt(9));
		
		//Sub String
		System.out.println(str1.substring(2, 5));
		System.out.println(str1.substring(2));
		
		//Splitting String
		String str2 = "A_B_C_D";
		String delimiter = "_";
		
		/*
		 * Splitting and adding the string to Array
		 * and fetching the data using Quick For Loop from Array
		 */
		
		String [] ar = str2.split(delimiter);
		
		for(String x : ar) {
			System.out.println(x);
		}
		
	}

}
