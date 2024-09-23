package numbers;

import java.util.Scanner;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string ");
		String n = s.nextLine();
		int b=98;
		
		System.out.println("Numer of alphabets whose ascii value is less thsn b "+ count(n,b));
		System.out.println("Numer of alphabets whose ascii value greater thsn b "+ (n.length()-count(n,b)));
	}
	
	public static int count(String n, int b)
	{
		int count=0;
		int l=n.length();
		
		for(int i=0;i<l;i++)
		{
			if(((int)n.charAt(i))<b)
			{
				count++;
			}
		}
		return count;
	}

}
