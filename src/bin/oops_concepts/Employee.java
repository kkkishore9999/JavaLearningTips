package oops_concepts;

public class Employee {
	
	String empName;
	int empId;
	int empSal;
	
	
	public void displayEmplBonus() {
		int empBonus = (int) (0.20 * empSal);
		System.out.println("Employee " + empName + " gets bonus of " + empBonus);
		 
	}

}
