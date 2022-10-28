package javademo;

import java.util.Scanner;

public class Factorialcalclation {

	public static void main(String[] args) { 
	System.out.println("number to find factorial:");
	Scanner n = new Scanner(System.in);
	int e = n.nextInt();
	int u = factt(e);
	System.out.println("factorial : "+u);
	}

	static int factt(int y) 
	{
		int output;
		if(y==1){
			return 1;
		}
		output = factt(y-1)*y;
		return output;
		
	}
	
}

