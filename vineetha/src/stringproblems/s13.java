package stringproblems;

import java.util.Scanner;

public class s13 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a line ");
		String s1=s.nextLine();
		s13 ob= new s13();
		ob.p1(s1);
	}
	
	// length should be odd greater than 3
	
	public void p1(String s)//s=s1
	
	{
		String[] c = s.split(" ");
		for(String x: c)
		{
			if(x.length()%2==0 && x.length()>4)
			{
			System.out.println(x);
			}
		}
	}
}
