package special_classes;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * Scanner class is used to accept the user input 
		 * during execution of a java program
		 */
		
		Scanner s1 = new Scanner(System.in);
		//Scanner Package needs to be imported specifically
		
		System.out.println("Please enter a String.");
		
		String str1 = s1.nextLine();

		
		System.out.println("String Entered is: " + str1);
		
		String temp = "";
		
		for(int i=0; i<=str1.length()-1;i++) {
			temp = str1.charAt(i) + temp;
		}
		
				
		System.out.println("Reversed String is : " + temp + "\n");

		System.out.println("Please enter a Number.");
			
		int num1 = s1.nextInt();
		
		System.out.println("Number entered is: "+ num1);
		
		
		
		

	}

}
