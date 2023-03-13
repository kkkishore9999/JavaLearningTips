package string_operations;

public class ReverseString {

	public static void main(String[] args) {

		//Write a program to reverse the string
		// Output: FEDCBA
		
		
		String str1= "ABCDEF";
		
		String temp = "";
		
		for(int i=0;i<=str1.length()-1;i++) {
			
			temp = str1.charAt(i) + temp;
		}

		System.out.println(temp);
		
	}

}
