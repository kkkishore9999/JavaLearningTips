package oops_concepts;

public class TempMethodOverloading {

	public static void main(String[] args) {
		
		Method_Overloading mo1 = new Method_Overloading();
		mo1.add(1, 2);  //int, int
		mo1.add(10.2, 20.2); //double, double
		mo1.add(2, 2.2); //int, double
		mo1.add(20.2, 2); //double, int
		mo1.add(1, 2, 50); //int, int, int

		
		
	}

}
