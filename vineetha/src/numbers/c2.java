package numbers;

import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		//print the alphabets which is having ascii value in the range b to j
		//98-106
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string ");
		String n = s.nextLine();
		int b=98;
		int j=106;
		System.out.println(count(n,b,j));
		
		// f : k
		// within the range
		//
		
		
	}
	
	public static int count(String n, int b, int j)
	{
		int count=0;
		int s=n.length();
		
		for(int i=0;i<s;i++)
		{
			if(b<=n.charAt(i) && n.charAt(i)<=j)
			{
				count++;
				System.out.println(n.charAt(i));
			}
		}
		
		return count;
	}
}
