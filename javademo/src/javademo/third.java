package javademo;

import java.util.Scanner;

public class third {
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a =Integer.parseInt(args[0]);
//		int b =Integer.parseInt(args[1]);
//		int c=a+b;
//		System.out.println("two no"+c);
		System.out.println("enter the person name ");
	
		
		Scanner input = new Scanner(System.in);
	    int i= input.nextInt();
	     
	    switch(i)
	    {
	    case 1:
	               System.out.println("Sunil:Mentor");	
	               break;
	    case 2:
	    	
	    		System.out.println("Praveen : Mngr");
	    		break;
	    
	    	default:
	    		System.out.println("Belinda : Trainee");
	}
	}
}
