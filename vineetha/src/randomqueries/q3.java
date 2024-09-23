package randomqueries;

import java.util.Scanner;

public class q3 {
//automorphic
	
	//25   : 25*25=> 625
	// 76  : 76*76 => 5776
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		boolean result=checking(n);
		if(result)
		{
			System.out.println("yes");
		}
		
		else
		{
			System.out.println("no");
		}
	}
	
	public static boolean checking(int n)
	{
		// integer to string
		String n1=Integer.toString(n);
		String n2=Integer.toString(n*n);
		if(n2.endsWith(n1))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
