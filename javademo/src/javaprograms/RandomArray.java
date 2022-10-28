package javaprograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {

	



	public static void main(String[] args) {
	//	int min,max;
		
		Random r = new Random();
		int[] n=new int[5];
		for(int i=0;i<n.length;i++) {
			n[i]=r.nextInt();
			System.out.println(n[i]);
			// r = ThreadLocalRandom.current().nextInt(min);
		}

	}
	
	}


