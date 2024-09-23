package randomqueries;

import java.util.Scanner;

public class p4 {

	// print all the substring of a strin
	
	// vinitha => v vi vin vinit
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String st = s.nextLine();
		int n=st.length();
		sub(st,n);
	}
	
	public static void sub(String s, int n)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<n;j++)
			{
			System.out.println(s.substring(i, j));	
			}
		}
	}
}
