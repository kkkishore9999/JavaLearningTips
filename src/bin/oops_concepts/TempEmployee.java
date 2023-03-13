package oops_concepts;

public class TempEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empId = 100;
		e1.empName = "Savithri";
		e1.empSal = 1000;
		
		e1.displayEmplBonus();

		
		Employee e2 = new Employee();
		e2.empId = 101;
		e2.empName = "Padmini";
		e2.empSal = 2000;
		
		e2.displayEmplBonus();
		
	}

}
