package special_classes;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		/*
		 * Some useful methods from StringBuilder 
		 * insert, replace, delete, reverse
		 */
		
		StringBuilder sb1 = new StringBuilder("Learning is fun..");

		sb1.insert(9, "Java ");
		
		System.out.println(sb1);

		sb1.replace(0, 8, "Everything in ");
		
		System.out.println(sb1);
		
		sb1.deleteCharAt(20);
		
		System.out.println(sb1);
		
		sb1.delete(2, 9);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
	}

}
