package javademo;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage_calculator {

	public static void main(String[] args) {
		final byte monthInYears = 12;
		final byte percent=100;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Principal:");
		int principal = sc.nextInt();
		
		System.out.print("Annual interest rate:");
		float monthlyInterest = sc.nextFloat();
		float anualInterest = monthlyInterest/percent/monthInYears;
		System.out.println("Annual Interest:"+anualInterest);
		
		System.out.print("Period years : ");
		byte years = sc.nextByte();
		int numberOfPyments = principal*monthInYears;
		System.out.println("Payments:"+numberOfPyments);
		
		double mortgage = principal
				*(monthlyInterest*Math.pow(1+ monthlyInterest,numberOfPyments)
				          /(Math.pow(1+ monthlyInterest,numberOfPyments)-1));
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(numberOfPyments);
		System.out.println("Mortgage:"+mortgageFormatted);
	}

}
