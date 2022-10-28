package basics;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws Exception
	{
		System.out.println("enter a number : ");
		//InputStreamReader is = 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		System.out.println(t);

	}

}
