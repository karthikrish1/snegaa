package primee;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the startin value : ");
		int start=s.nextInt();
		
		System.out.println("Enter the ending value : ");
		int end=s.nextInt();
		
	for(int i=start;i<end;i++)
		{
			if(p3.checking(i))
			{
				System.out.println(i);
			}
		}
		
	}
	public static boolean checking(int n)
	{
		if(n==0||n==1)
		{
			return false;
		}
		if(n==2)
		{
			return true;
		}
		
		// i<n
		//i<n/2
		//i<math.sqrt
		// i*i=n
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		}
	}


