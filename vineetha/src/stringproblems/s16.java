package stringproblems;

import java.util.Scanner;

public class s16 {
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1 = s.nextLine();
		
		String result="";
		for(int i=0;i<s1.length();i++)
		{
			boolean a1 = Character.isDigit(s1.charAt(i));
			boolean a2 = Character.isAlphabetic(s1.charAt(i));
			
			if(a1||a2)
			{
				result+=s1.subSequence(i, i+1);
			}
		}
		
		System.out.println(result);
	}

}
