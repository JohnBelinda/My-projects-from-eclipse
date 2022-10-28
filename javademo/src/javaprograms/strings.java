package javaprograms;

public class strings {

	public static void main(String[] args) {
		
		//reversing of string 
		String r = "theresa ";
		StringBuilder sb = new StringBuilder(r);
		System.out.println(sb.reverse());
	
		
		String tr = "83053405";
		StringBuilder sbb = new StringBuilder(tr);
		System.out.println(sbb.reverse());
		
		//java string provides various methods to access the string
		//to get length - one way
		System.out.println(tr.length());
		//to get length - 2nd way
		int trr = tr.length();
		System.out.println("length: "+trr);
		
		//joining two strings : way -one 
		System.out.println(r.concat(tr));
		//way 2
		String trrr = r.concat(tr);
		System.out.println(trrr);
		
	    //finding equals of strings
		System.out.println(r.equals(tr));
		
		//here == is performed
		String e = "54";
		String f = e;
		System.out.println(e==f); //here if number e is assigned to f the true if any other value wit e is added then false
		
		
		//swaping of strings
		String str1 = "Belinda";
		String str2 = "John";
		
		System.out.println("1st: "+str1);
		System.out.println("2nd: "+str2);
		
		str1 =str1+str2;
		str2=str1.substring(0, (str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		//reversing wrds from given string 
		
		
		
		//remove characters
		String remov = "Belinda";
		String oo=remov.replace("a","");
		System.out.println(oo);
		
		String convert = "473834";
		int con = Integer.parseInt(convert);
		System.out.println(con);
	
		
		String ipstr = "I am John Belinda Ann";
	}
		
		public static void toDuplicate(String ipstr){
			int count=0;
			
			for(int i=0;i<=ipstr.length()-1;i++) {
				char c = ipstr.charAt(i);
				for(int j=0;j<=ipstr.length()-1;i++) {
					if(ipstr.charAt(i) != c) {
						continue;
				}
				count++;	
			}
			
		}
	
		}
}
	
	

