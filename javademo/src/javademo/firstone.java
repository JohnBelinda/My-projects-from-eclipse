package javademo;

public class firstone {
	public static void main(String args[]) {
		System.out.println("learn jaVA fast");
		
		boolean y= true;
		System.out.println("true");
		boolean t=false;
		System.out.println("false");
		if (y) System.out.println("this is exe");
		y=false;
		if(y) System.out.println("this will not be executed ");
	     System.out.println("truth is "+(10>=5));	
	     
	    byte u;
	    double p;
	    int m=8767;
	    System.out.println("conversion of int to byte");
	    u = (byte) m;
	    System.out.println(u);
	    
	    p=(int)m;
	    System.out.println(p);
	    
	    p=(byte)u;
	    System.out.println(p);
	    
	    byte b=42;
	    char c='w';
	    short s=1024;
	    int i = 5000;
	    float f=5.7f;
	    double d = .1234;
	    double result=((f*b)+(i/c)-(d*s));	    
	    System.out.println(result);
	    
	    double ab = 5;
	    
	     
	}

}
