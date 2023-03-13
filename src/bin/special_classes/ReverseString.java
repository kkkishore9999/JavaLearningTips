package special_classes;

public class ReverseString {

	public static void main(String[] args) {
		
		//Lets write the string
		String str = "ABCD";
		
		String temp = "";
		
		for(int i=0; i<= str.length()-1 ; i++) {
			temp = str.charAt(i) + temp;
		}
		
		System.out.println("Reverse String: "+temp);

	}

}
