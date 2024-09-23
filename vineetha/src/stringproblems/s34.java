package stringproblems;

import java.util.Scanner;

public class s34 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String l = s.nextLine();
		filtering(l);
	}
	public static void filtering(String l)
	{
		String[] words = l.split(" ");
		//create an array to store length of each word
		
		int length[]= new int[words.length];
		
		//iterating through the array  , calculating the length of each=> length array
		
		for(int i=0;i<words.length;i++)
		{
			length[i]=words[i].length();
		}
		
		for(int i=0;i<words.length;i++)
		{
			if(length[i]%2==0)   /// odd, 4,3
		{
				System.out.println(words[i]);
		}
		}
		
}}