package basics;

public class BreakWhileLoop {

	public static void main(String[] args) {
		
		int a = 100;
		
		while (a >50)
		{
			a-=5;
			if(a==75) {
				break;
			}
			System.out.println(a);
		}

	}

	//It will not print after 80 and break as it matches with 75

}
