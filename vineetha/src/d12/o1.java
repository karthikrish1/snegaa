package d12;

import java.util.Scanner;

public class o1 {
public static void main(String[] args) {
	
	// number of consonants, number of vowels
	// String:  can contain numbers, only lower case 
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string :");
	String word = s.nextLine();
	int vc=0;
	int cc=0;
	int nc=0;
	//iterating through the string: each character
	
	for(int i=0;i<word.length();i++)
	{
		char w = word.charAt(i);
		if(checking(w)==true)
		{
			vc+=1;
		}
		
		else if(w>='a'&& w<='z' && checking(w)==false)
		{
			cc+=1;
		}
		
		else
		{
			nc+=1;
		}
	}
	
	System.out.println("Vowel count "+ vc);
	System.out.println("consonant count"+ cc);
	System.out.println("Number count"+ nc);
	
	//String: uppercase, number, print vowels and numbers 
}

public static boolean checking(char c)
{
	char vowels[]= {'a','e','i','o','u'};
	
	for (int i=0;i<vowels.length;i++)
	{
		if(c==vowels[i])
		{
			return true;
		}
	}
	return false;
}
}
