package numbers;

import java.util.Scanner;

public class b1 {
public static void main(String[] args) {
	
	//buzz  number: divisible by 7 or end wth 7
	
	// divisible by 5 or ends with 8
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=s.nextInt();
	boolean result = check(n);
	if(result==true)
	{
		System.out.println("BUZZ");
	}
	
	else
	{
		System.out.println("not");
	}
}

public static boolean check(int n)
{
	return (n%7==0 ||n%10==7);
	}
}
