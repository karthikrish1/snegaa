package stringproblems;

import java.util.Scanner;

//method 6: using scanner 
public class s6 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word ");
		String word = s.nextLine();
		char[] a = word.toCharArray();
		String n="";
		
		for(int i=word.length()-1;i>=0;i--)
		{
			n=n+word.charAt(i);
		}
		
		System.out.println(n);
		
	}
}
