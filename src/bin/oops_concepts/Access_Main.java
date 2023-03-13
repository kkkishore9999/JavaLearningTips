package oops_concepts;

public class Access_Main {

	public static void main(String[] args) {
		
		Access_Specifiers ac = new Access_Specifiers();
		ac.doThisDefault();
		ac.doThisPublic();
//		ac.doThisPrivate();
		
		//We cannot call private method from different class
		//Public Methods can be accessed as are part of same package.
		
		System.out.println(ac.a);
		System.out.println(ac.b);
		
	}

}
