package stringproblems;

import java.util.Scanner;

public class m {

	
	
	
	//file=> new=> project=> maven=> maven project=> create a simple project=>
	// group id, arfact id=> finish
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//65-91   A-Z  //camel case letter 
		//97-122: a-z
		//uppercase: camel case letters 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word ");
		String st = s.nextLine();
		printupper(st);
	}
	
	public static void printupper(String st)
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>=65 && st.charAt(i)<=91)
			{
				count++;
			}
			
			//A, Z
		}
		System.out.println(count);
	}
}
