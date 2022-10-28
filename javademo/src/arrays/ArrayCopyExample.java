package arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] copyfrom= {'a','b','c','d','e','f','g','h','i'};
		char[] copyto = new char[7];
		
		System.arraycopy(copyfrom, 2,copyto,0,7);
		System.out.println(new String(copyto));

	}

}
