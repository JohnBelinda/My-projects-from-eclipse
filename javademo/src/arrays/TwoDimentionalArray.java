package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows = s.nextInt();
		System.out.println("Enter columns : ");
		int cols = s.nextInt();
		
		int[][] a = new int[rows][cols];
		System.out.println("Enter "+rows+"X"+cols+" = "+(rows*cols)+"integers : ");
		for (int i=0;i<rows;i++) {
			for(int j=0; j<cols;j++) {
				a[i][j] =s.nextInt();
				
			}
		}
		//System.out.println("find the integers"+(rows*cols)+"integers in "+rows+"x"+cols+"2 d array");
		System.out.println(Arrays.deepToString(a));

	}

}
