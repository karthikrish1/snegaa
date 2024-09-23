package checkingg;

import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		//ugly numbers :  2,3,5
		//6
		//20
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur number : ");
		int n=s.nextInt();
		int result=checking(n);
		if(result==1)
		{
			System.out.println(" it s");
		}
		else
		{
			System.out.println("it is not");
		}
	}
	
	public  static int checking(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		if(n<=0)
		{
			return 0;
		}
		
		if(n%2==0)
		{
			return (checking(n/2));
		}
		
		if(n%3==0)
		{
			return (checking(n/3));
		}
		
		if(n%5==0)
		{
			return (checking(n/5));
		}
		return 0;
	}
}
