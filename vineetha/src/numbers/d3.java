package numbers;

import java.util.Scanner;

public class d3 {

	//semiprime
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		boolean result = check(n);
		if(result==true)
		{
			System.out.println("semiprime");
		}
		
		else
		{
			System.out.println("not  a semi prime ");
		}

	}
	
	
	
	public static boolean check(int n)
	{
		int c=0;
		for(int i=2; i*i<n &&c<2;++i)
		
			while(n%i==0)    //16%2==0              //16%3=1
			{
				n=n/i;     //  n=16/2;  n=8
				++c;       //c=1
			}
			
			if(n>1)         //3>1   c=2
				++c;
		return c==2? true : false;
	}
}
