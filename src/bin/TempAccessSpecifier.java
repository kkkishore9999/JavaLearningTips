import oops_concepts.Access_Specifiers;

public class TempAccessSpecifier {

	public static void main(String[] args) {
		
		Access_Specifiers ac = new Access_Specifiers();
//		ac.doThisDefault();
		ac.doThisPublic();
//		ac.doThisPrivate();
		
		//We cannot call private method and default from different class and of different package
		// Public Methods can be accessed from different packages.
		
		System.out.println(ac.a);
		
	}

}
