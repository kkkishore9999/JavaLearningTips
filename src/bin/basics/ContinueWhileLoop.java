package basics;

public class ContinueWhileLoop {

	public static void main(String[] args) {
		int a = 100;
		while (a > 50) {
			a -= 5;
			if (a == 75) {
				continue;
			}
			System.out.println(a);
		}
//It will not print 75 and continue from 80 then to 70
	}

}
