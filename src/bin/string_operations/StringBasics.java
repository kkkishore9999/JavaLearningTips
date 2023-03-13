package string_operations;

public class StringBasics {

	public static void main(String[] args) {
		/*
		 * Concatenation
		 * Length
		 * Trim
		 * Upper Case
		 * Lower Case
		 * Empty
		 * Not Empty
		 * 
		 */
		
		String Str1 = "Srinivas";
		String Str2 = " Kadiyala";
		
		// Concatenation
		String Str3 = Str1 + Str2;
		System.out.println(Str3);
		
		String Str4 = Str1.concat(Str2);
		System.out.println(Str4);
		
		//String + Num Concatenation
		int num1 = 100;
		System.out.println(Str1 + num1);
		
		
		// Length of String
		System.out.println(Str1.length());
		
		// Index
		System.out.println(Str1.indexOf('S'));
		System.out.println(Str1.indexOf('a'));
		
		// Trim
		String Str5 = "               ABC             EDC          HIJ     ";
		System.out.println(Str5);
		System.out.println(Str5.trim());
		
		// To Uppercase
		System.out.println(Str2.toUpperCase());
		
		// To Lower case
		System.out.println(Str5.toLowerCase());
		
		// Is Empty
		String Str6="";
		System.out.println(Str6.isEmpty());
		
		// Is Not Empty
		System.out.println(Str5.isEmpty());
		
		
		
		
		
		

	}

}
