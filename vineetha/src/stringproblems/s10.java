package stringproblems;

import java.util.Scanner;

public class s10 {

	public static void main(String[] args) {
		
		//vinitha
		//0123456
		//in
		
		//output:  vtha
		
		//hi vinitha
		//ahthinivih
		
		// ih   athiniv
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = s.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = s.nextLine();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s10.fixing(s1, s2));
	}
	
	public static String fixing(String s1, String s2)
	{
		int[]a= new int[256];    
		for(int i=0;i<s2.length();i++)
		{
			a[s2.charAt(i)]++;  // a[c]++
		}
		
		String o="";
		for(int i=0;i<s1.length();i++)
		{
			if(a[s1.charAt(i)]==0)
			{
				o+=s1.charAt(i);//  
			}
					
			
		}
		
		return o;
	}
}
