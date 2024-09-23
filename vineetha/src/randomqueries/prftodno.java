package randomqueries;

import java.util.Scanner;

public class prftodno {

	//23
	//49 7*7
	// 64 8*8
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number ");
		double number = s.nextDouble();
		boolean result = checking(number);
		if(result)
		{
			System.out.println("They are perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
	}
	
	public static boolean checking(double number)
	{
		double s = Math.sqrt(number);
		
		double result = s-Math.floor(s);
		if(result==0)
		{
			return true;
		}
		return false;
	}
}
