package nw1;

import java.util.Scanner;

public class m2 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word ");
		String w=s.nextLine();
		System.out.println(result(w));
	}
	
	public static boolean result(String w)
	{
		int n=w.length();
		
		if(n<2)
		 return false;
		if(w.charAt(0)==w.charAt(n-1))   /// first and last character 
			return true;
		else
			return false;
	}
}
