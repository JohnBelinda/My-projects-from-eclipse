package javademo;

public class sixth {
	public static void main(String[] args) {
		int marks [] = {56,67,89,90,67,89};
		double average = 0.0;
		int sum =0;
		for(int i=0;i<6;i++) {
			sum+=marks[i];
			
		}
		System.out.println(sum);
		average=sum/6;
		System.out.println(average);
		
		
		String names[][]= {{"belinda","ann"},{"john","bosco"},{"maria","john"},{"john","rodin"}};
		for(int j=0;j<4;j++) {
			for(int k=0;k<2;k++) {
				System.out.print(names[j][k]+" ");
			}
			System.out.println();
		}
 	}
	
	
	

}

