package oops_concepts;

public class ClassRoom_Main {

	public static void main(String[] args) {
		
		ClassRoom cr = new ClassRoom();
		
		cr.setSubj("Math");
		cr.setStudCount(50);
		
		
		cr.displayDetails();

		
		ClassRoom cr1 = new ClassRoom();
		
		cr1.setSubj("English");
		cr1.setStudCount(50);
		
		
		cr1.displayDetails();

		
	}

}
