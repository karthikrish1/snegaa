package nw1;

import java.util.Scanner;

public class m1 {
public static void main(String[] args) {
	
	// get a word from the user
	// all the characters are same or not 
	// vvv
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the word ");
	String w=s.nextLine();
	System.out.println(result(w));
}

public static boolean result (String w)
{
	int n=w.length();
	for(int i=0;i<n;i++)
	{
		if(w.charAt(i)!=w.charAt(0))
		{
			return false;
		}
		
	}
	return true;
	}
}
