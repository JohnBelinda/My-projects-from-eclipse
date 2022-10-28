package javademo;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		int age = 25;
		int herage = 30;
		System.out.println(herage);
		Date today = new Date();
		System.out.println(today);
		
		String message = "  Hello "+"world!!  ";
		
		System.out.println(message.replace("!","*"));
		System.out.println(message.trim());
		System.out.println(message);
		String name = "Hello \t\"Belinda\"";
						System.out.println(name);
         //reference types,  list of same characteristics in one class
						int[] numbers = new int[5];
						numbers[0]=1;
						numbers[1]=2;
						numbers[2]=3;
						System.out.println(Arrays.toString(numbers));
						
						int [] num = {1,4,3,9,0,2};
						Arrays.sort(num);
						System.out.println(Arrays.toString(num));
						
		//multidimentional arrays  :
                    int[][] twodimentional = new int[2][3];
                    twodimentional[0][0] = 1;
                    System.out.println(Arrays.deepToString(twodimentional));
                    
                    int [][] tdm = {{1,2,3,4,5},{1,2,3,4,5}};
                    System.out.println(Arrays.deepToString(tdm));
                    
                    //arithmetic expressions 
                    int add = 2+90;
                    System.out.println(add);
                    
                    //during division 
                    double div = (double)90/(double)8;
                    System.out.println(div);
                    
                    //wraper classes 
                    String v = "1";
                    int t = Integer.parseInt(v)+2;
                    System.out.println(t);
                    
                    //using math class -Mathematical operations (Math class) 
                    int s = Math.round(1.1F);
                    System.out.println(s);
                    
                    int rn = (int) (Math.random()*100) ;
                    System.out.println(rn);
                    
                    //using number format class 
                    NumberFormat currency = NumberFormat.getCurrencyInstance();
                    String res = currency.format(1234567.785);
                    System.out.println(res);
                    
                    //example of chaining methods 
                    String percent = NumberFormat.getPercentInstance().format(0.5);
                    System.out.println(percent);
                    
                    
                    
                    
                    //reading input 
                      Scanner sv = new Scanner(System.in);
                      System.out.print("your name?");
                      String na = sv.nextLine().trim(); //for double name 
                     // String ne = sv.next();  //for single string or name 
                      System.out.println(na);
                      
                      
                      String tr = "23DGH45";
                      System.out.println(tr);
                    
						
	}

}
