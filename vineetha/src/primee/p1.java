package primee;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		
		//prime number: number which is divisible by itself and 1 => 2,3,5,7,11,13,17,19,23...
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter hte number");
		int n=s.nextInt();
		p1 ob= new p1();
		boolean r = ob.result(n);
		if(r==true)
		{
			System.out.println("it is a prime");
		}
		else
		{
			System.out.println("not a prime ");
		}
		
	}
	
	// try inputstean=> get the number
	// static : boolean 
	// n/2
	
	
	// i<n
	// i<n/2
	// i<Math.squrt(n)
	
	public boolean result (int n)
	{
		if(n<=1)
		{
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++)    
		{
			if(n%i==0)   // 4,2    4.33...   number is divisible by any of the other numbers 
				return false;
		}
		return true;
		
	}
}
