package numbers;

import java.util.Scanner;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		boolean result = check(n);
		if(result==true)
		{
			System.out.println("duck");
		}
		
		else
		{
			System.out.println("not");
		}

	}
	
	public static boolean check(int n)
	{
		String s = Integer.toString(n);
		int l=s.length();
		boolean result=false;
		for(int i=1;i<l;i++)
		{
			if(s.charAt(i)=='0')
			{
				result=true;
				break;
			}
		}
		
		return (result&& s.charAt(0)!='0');
	}

}
