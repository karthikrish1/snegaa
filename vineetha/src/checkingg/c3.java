package checkingg;

import java.util.Scanner;

public class c3 {
public static void main(String[] args) {
	
	// nude: which is divible by all of its digits
	// 672
	// 672=> 6,  7  ,2
	
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
	int d;
	int NUM=n;               // NUM=672
	while(n!=0)
	{
		d=n%10;                  //d=140%10  => 0
		n=n/10;                  //n=140/10  -> 14
		if(d==0 || NUM%d!=0 )    // d==0  ||  140%2!=0   => false   
		{
			return false;
		}
	}
	return true;               //true 
	
}

}
