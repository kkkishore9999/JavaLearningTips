package string_operations;

public class StringConversions {

	public static void main(String[] args) {

		/*
		 * Methods: toString toBinaryString toHexString toOctalString parseInt
		 * 
		 */

		int num1 = 100;

		System.out.println(Integer.toString(num1));

		System.out.println(Integer.toBinaryString(num1));

		System.out.println(Integer.toHexString(num1));

		System.out.println(Integer.toOctalString(num1));

		
		String str= "100";
		String binStr = "1100100";
		String hexStr = "64";
		String octStr = "144";
		
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.parseInt(binStr, 2));
		System.out.println(Integer.parseInt(hexStr, 16));
		System.out.println(Integer.parseInt(octStr, 8));
		
		
	}

}
