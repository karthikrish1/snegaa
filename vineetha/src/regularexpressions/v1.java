package regularexpressions;

import java.util.Scanner;

public class v1 {

	public static void main(String[] args) {
		
		//vowels=> aeiou
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a word ");
		String word = s.nextLine();
		
		//regex=> .*[aeiou].*
		boolean result = word.toLowerCase().matches(".*[aeiou].*");
		if(result)
		{
			System.out.println("there is a match");
		}
		
		else
		{
			System.out.println("no match");
		}
		
	}
}
