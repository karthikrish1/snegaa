package checkingg;

import java.util.Scanner;

public class pe2 {
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
	if(Math.ceil((double)Math.sqrt(n))==Math.floor((double)Math.sqrt(n)))
{
		return true;
	}
	else
	{
		return false;
	}
	
	}
}
