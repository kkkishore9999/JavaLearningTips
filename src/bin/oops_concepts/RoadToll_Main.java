package oops_concepts;

public class RoadToll_Main {

	public static void main(String[] args) {
		Road_Toll r1 = new Road_Toll();
		r1.tyres_count = 6;
		
		r1.calculateTollAmount();
		
		
		Road_Toll r2 = new Road_Toll("truck", 4);
		r2.calculateTollAmount();

	}

}
