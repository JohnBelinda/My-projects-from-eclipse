package javademo;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[]) {
		System.out.println("Your calci :");
		Scanner d = new Scanner(System.in);
		double input1 = d.nextDouble();
		double input2 = d.nextDouble();
		System.out.println("Enter operator :");
		char c = d.next().charAt(0);
		double result;
		switch(c) {
		case '+':
			result = input1+input2;
			System.out.println("addition"+result);
			break;
		
		case '-':
			result = input1+input2;
	       System.out.println("subtraction"+result);
	       break;
	    	   
		case '*':
		   result = input1+input2;
		   System.out.println("multiplication : "+result);
		   break;
		   
		case '/':
			result = input1 +input2;
			System.out.println("division"+result);
			break;
			
		default:
			System.out.println("error give valid operator");
			
			
		}
	}

}
