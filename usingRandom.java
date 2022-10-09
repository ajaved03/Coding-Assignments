package CShw2;

import java.util.Random;

public class usingRandom {
	public static void main(String[] args) {
		
		Random generator1=new Random(1000);
		
		System.out.print("From generator1: ");
		
		for(int i=0;i<50;i++) {
			System.out.print(generator1.nextInt(100)+" ");
		}
	}
}
