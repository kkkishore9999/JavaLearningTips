package oops_concepts;

public class Static_Main {

	
	public static void main(String[] args) {
		
		Static_Keyword sk1 = new Static_Keyword();
		Static_Keyword sk2 = new Static_Keyword();
		
		sk1.age=7;
		sk1.grade="2nd";
		Static_Keyword.name="Bob";
		
		sk2.age=9;
		sk2.grade="1st";
		Static_Keyword.name="Rob";
		
		sk1.displayDetails();
		sk2.displayDetails();
		
		Static_Keyword.doThis();
		

	}

}
