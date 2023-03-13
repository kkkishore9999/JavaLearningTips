package string_operations;

public class StringComparisons {

	public static void main(String[] args) {
		/*
		 * String Comparison Methods
		 * Equals
		 * CompareTo
		 * Matches
		 * 
		 */
		
		
		// Equals
		String Str1 = "ABCD";
		String Str2 = "ABCd";
		String Str3 = "ABCD";
		
		System.out.println(Str1.equals(Str2));
		System.out.println(Str1.equals(Str3));
		
		System.out.println(Str1.equalsIgnoreCase(Str2));
		
	
		if(Str1.equals(Str2)) {
			System.out.println("String are Equal");
		}
		else {
			System.out.println("Strings are not Equal");
		}
		
		
		// CompareTo
		System.out.println(Str1.compareTo(Str2));
		System.out.println(Str1.compareTo(Str3));
		System.out.println(Str1.compareToIgnoreCase(Str2));
		
		//Matches - Regular Expression
		 String line = "This order was placed for QT3000! OK?";
	     String pattern = "(.*)(\\d+)(.*)";
		
		System.out.println(line.matches(pattern));
				
		
		
		
		
		

	}

}
