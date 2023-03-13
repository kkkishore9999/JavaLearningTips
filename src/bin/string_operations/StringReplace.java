package string_operations;

public class StringReplace {

	public static void main(String[] args) {

		/*
		 * Methods: Replace - Normal ReplaceAll - Regex
		 */

		String str1 = "Concentrate Java 2019 Programming";
		String str2 = "2019";
		String str3 = "2020";

		// Replace
		System.out.println(str1.replace(str2, str3));
		System.out.println(str1.replace('C', 'c'));

		//ReplaceAll 
		String Str = new String("Welcome to Tutorialspoint.com");
		System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "Srinivas"));

	}

}
