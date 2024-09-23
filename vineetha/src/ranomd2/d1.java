package ranomd2;

import java.util.HashSet;
import java.util.Scanner;

public class d1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter word");
		String w = s.nextLine();
		
		HashSet<Character>u= new HashSet<>();
		for(int i=0;i<w.length();i++)
		{
			char c = w.charAt(i);
			if(u.contains(c)==true) {
				u.remove(c);
				
			}
			else
			{
				u.add(c);
			}
		}
		if(u.size()==0)
		{
			System.out.println("no unique characters");
		}
		
		//print unique characters
		for(char x:u)
		{
			System.out.println(x);
		}
	}
}
