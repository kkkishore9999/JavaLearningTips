package oops_concepts;

public class Road_Toll {
	
	String vehicle_type;
	int tyres_count;
	int toll_amount;
	
	public void calculateTollAmount() {
		if(tyres_count==2) {
			System.out.println("The toll amount is 0");
		}
		else if (tyres_count==4) {
			System.out.println("The toll amount is 10");
		}
		else if (tyres_count>4) {
			System.out.println("The toll amount is 20");	
		}	
	}
	
	
	//No Argument Constructor
	public Road_Toll() {
		System.out.println("Constructor is executed");
	}
	 
	//Argument Constructors
	public Road_Toll(String vehicle_type,int tyres_count) {
		this.vehicle_type = vehicle_type;
		this.tyres_count = tyres_count;
		
		//this means = variable of this class.
		//RHS = variable of method level
		//LHS = variable of class level
		
	}
	

}
