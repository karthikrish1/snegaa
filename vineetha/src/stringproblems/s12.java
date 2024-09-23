package stringproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s12 {
	
	// how are you      => ["how","are", "you"]
	// woh  era  uoy
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the line ");
		String s = br.readLine();
		System.out.println(r1(s));
		
		
	}
	
	public static String r1(String s)
	{
		 String[] c = s.split(" ");
		 String rev=" ";
		 for(int i=0;i<c.length;i++) 
		 {
			 StringBuffer s3= new StringBuffer(c[i]);
			 rev+=s3.reverse().toString();
			 rev+=" ";
		 }
		 return rev;
	}

}
