package string_operations;

public class StringSearch {

	public static void main(String[] args) {
		/*
		 * 
		 * Methods:
		 * Contains
		 * Starts With
		 * Ends With
		 * Index of
		 * Last Index of
		 * 
		 */
		
		String str1 = "I love Java and Selenium abc";
		
		String str2 = "java";
		
		
		//Contains
		System.out.println(str1.contains(str2));
		System.out.println(str1.toLowerCase().contains(str1.toLowerCase()));
		
		
		//Starts With
		System.out.println(str1.startsWith("I"));
		
		//Ends With
		System.out.println(str1.endsWith("abc"));

		//Length
		System.out.println(str1.length());
		
		//Index of - First Occurrence in String
		System.out.println(str1.indexOf('a'));
		
		//Index of - String, using Start Index (9)
		System.out.println(str1.indexOf("a",9));
		
		//Last Index Of - 
		System.out.println(str1.lastIndexOf("c"));
		
		
	}

}
