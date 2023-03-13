package special_classes;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random r1 = new Random();
		
		for(int i=0;i<=2;i++) {
			//Generate random numbers: 0 and less than 10
			System.out.println(r1.nextInt(10));
			
			//Generate random numbers: [0 till 9000] +  1000
			System.out.println(r1.nextInt(9000) + 1000);
			
			//Math Random
			int m1 = (int) (Math.random()*1000 + 10000);
			System.out.println(m1);
			
			
			int h1 = r1.hashCode();
			System.out.println(h1);
			
		}

	}

}
