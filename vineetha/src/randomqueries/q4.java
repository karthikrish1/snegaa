package randomqueries;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word");
		String w = s.nextLine();
		int count1=count(w);
		System.out.println("Number of letters "+ count1);
		
	}
	
	public static int count(String s)
	{
		int l=0;
		char[] c = s.toCharArray();
		for(char x: c)
		{
			l++;
		}
		return l;
	}

}
