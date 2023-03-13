package inheritance;

public class Main_Polygon {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setValues(10.0,20.98);
		
		Triangle t1 = new Triangle();
		t1.setValues(20.98, 34.987);
		
		r1.calculateRectangle();
		t1.calculateArea();
		

	}

}
