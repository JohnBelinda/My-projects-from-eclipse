package arrays;

import java.util.Scanner;

class AddTwoMatrix {

	        	  int m,n;
	        	  int first[][] = new int[m][n];
	        	  int second[][] = new int[m][n];
	        	  
	        	   AddTwoMatrix(int m,int n, int[][] first, int[][] second) {
	        		  this.first = first;
	        		  this.second = second;
	        		  this.m = m;
	        		  this.n = n;
	        	  }
	          
	        		public AddTwoMatrix(int[][] first2, int[][] second2, int m2, int n2) {
					// TODO Auto-generated constructor stub
				}

					public static void main(String[] args) {  
	        			int m,n,c,d;
	        			Scanner s = new Scanner(System.in); 
	        			System.out.println("Enter the number of rows and columns : ");
	        			m = s.nextInt();
	        			n = s.nextInt();
	        			
	        			int first[][] = new int[m][n];
	        			int second[][] = new int[m][n];
	        			
	        			System.out.println("enter first matrix numbres : ");
	        			for(c=0;c<m;c++) {
	        				for(d=0;d<n;d++) {
	        					first[c][d] = s.nextInt();
	        					
	        				}
	        			}
	        				System.out.println("Enter elements of second matrix : ");
	        				for(c=0;c<m;c++) {
	        					for(d =0;d<m;d++) {
	        						second[c][d] = s.nextInt();
	        					}
	        				}
	        				System.out.println("Elements of first matrix : ");
	        				for(c=0;c<m;c++) {
	        					for(d =0;d<m;d++) {
	        				System.out.print(first[c][d]+"\t");
	        					}
	        					System.out.println();
	        				}
	        				System.out.println("Elements of second matrix : ");
	        				for(c=0;c<m;c++) {
	        					for(d =0;d<m;d++) {
	        				System.out.print(second[c][d]+"\t");
	        					}
	        				System.out.println();
	          }
	        		
	        	AddTwoMatrix a =new AddTwoMatrix(first,second,m,n);//call by reference
	        	
	        	a.addmatrix(a); //passing object
	        	}
	        	public void addmatrix(AddTwoMatrix a) {
	        		int c,d;
	        		int sum[][]=new int[a.m][a.n];
	        		for(c=0;c<a.m;c++) {
	        			for(d=0;d<a.n;d++) {
	        				sum[c][d] = a.first[c][d]+a.second[c][d];				
	        			}
	        		}
	        		System.out.println("sum of two matrices");
	        		for(c=0;c<a.m;c++) {
	        			for(d=0;d<a.n;d++) {
	        				System.out.print(sum[c][d]+"\t");
	        			}
	        			System.out.println();
	        		}
	        		
	        	}
	        		//System.out.println();

}

