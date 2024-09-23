package randomqueries;

import java.util.Scanner;

public class per2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		double number=s.nextDouble();
		per2 ob= new per2();
		boolean result=ob.check(number);
		if(result) {
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
			}
		
		// double => int  // downcasting(by default) 
	}
	public boolean check(double number)
	{
		for(int i=1;i<=number;i=i+1)// 1 to 49    // i=7
		{
			//7th iteration  i=7   number=49 
			
			// 49%7==0       49/7==7
			if((number%i==0)&& (number/i==i))
			{
				return true;
			}
		}
		
		return false;
	}
}
