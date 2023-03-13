package basics;

public class NestedIf {

	public static void main(String[] args) {
		/* 
		 * Create a program to find the grade of a student
		 * marks >= 90 => A Grade
		 * marks >= 75 => B Grade
		 * marks >= 60 => C Grade
		 * marks >= 40 => D Grade
		 * marks < 40 => Fail
		 * 
		 */
		
		int marks = 20;
				
		if(marks >= 90) {
			System.out.println("A Grade");
		}
		else if(marks>=75 & marks <90){
			System.out.println("B Grade");
		}
		else if(marks >=60 & marks <75) {
			System.out.println("C Grade");
		}
		else if(marks >=40 & marks <60) {
			System.out.println("D Grade");
		}
		else if(marks <40) {
			System.out.println("Fail");
		}
		

	}

}
