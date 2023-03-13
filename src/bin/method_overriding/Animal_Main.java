package method_overriding;

public class Animal_Main {
	
	//Child Class overrides the Parent Class
	//Same Method with Same arguments for Parent Class and Child Class

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.whoAmI();
		
		a = new Dog();
		a.whoAmI();
		
		a = new Cat();
		a.whoAmI();
		
		
		
		
		
//		Dog d1 = new Dog();
//		d1.whoAmI();
//		
//		Cat c1 = new Cat();
//		c1.whoAmI();


	}

}
