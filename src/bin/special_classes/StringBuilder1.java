package special_classes;

public class StringBuilder1 {

	public static void main(String[] args) {

		/*
		 * StringBuilder class is used to create mutable (modifiable) string
		 * Some useful methods:
		 * append, insert, replace, delete, reverse
		 */
		
		String str1 = "I";
		
		str1 = str1 + " Like";
		
		str1 = str1 + " Java";
		
		System.out.println(str1);
		
		//5 Distinct String Objects in memory

		//I / Like / I like / Java / I like Java
		
		StringBuilder sb1 = new StringBuilder("I");
		//StringBuilder = Java.lang.StringBuilder
		
		sb1.append(" Like");
		
		sb1.append(" Java");
		
		System.out.println(sb1);
		
		
	}

}
