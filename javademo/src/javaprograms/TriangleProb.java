package javaprograms;

import java.util.Scanner;

public class TriangleProb {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Numbers:");
		int a =s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println(isTriangle(a,b,c));

	}
	public static boolean isTriangle(int a,int b,int c) {
		return(a+b>c && b+c>a && c+a>b);
	}

}
