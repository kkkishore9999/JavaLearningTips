package oops_concepts;

public class Access_Specifiers {
	
	/*
	 * Public Access
	 * Default Access / No Access Specifier
	 * Private Access
	 * Protected Access
	 * 
	 */
	
	public int a = 100;
	int b = 200;
	private int c = 300;
	
	
	
	public void doThisPublic() {
		System.out.println("Its public Method");
	}
	
	private void doThisPrivate() {
		System.out.println("Its private Method");
	}
	
	//Private Method is accessible only within this class
	
	void doThisDefault() {
		System.out.println("Its Default Method");
	}
	
	
	

}
