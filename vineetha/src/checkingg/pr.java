package checkingg;

import java.util.Scanner;

public class pr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur number : ");
		int n=s.nextInt();
		boolean result = checking(n);
		if(result==true)
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
		if (n<=0)
		{
			return false;
			
		}
		
		if(n>0)
		{
			int sq=(int)Math.sqrt(n);
			return (sq*sq==n);
		}
		
		return false;
		
	}
}
