package randomqueries;

import java.util.Scanner;

public class le {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=s.nextInt();
	int square=n*n;
	boolean result = checking(n,square);
	if(result)
	{
		System.out.println("neon number");
	}
	else
	{
		System.out.println("it is not a neon number ");
	}}
public static boolean checking(int n, int square)
{
	if(square==0)
		{
		return false;
		
		}
	else
	{
		int d=square%10;
		boolean r=checking(n-d,square/10);
		System.out.println(r);
		return r;
	}
	
	
}
}
