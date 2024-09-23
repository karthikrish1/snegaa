package stringproblems;

import java.util.Scanner;

public class sv1 {
public static void main(String[] args) {
	
	
	//0 1 2 3 4 5 6  7 8 9 10 11
	//G o o d   m  r n g   v  initha  
	// first and last character of each word in the sentence
	// Gd mg va
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the sentence ");
	String st = s.nextLine();
	printing(st);
}

public static void printing(String st)
{
	int i;
	for( i=0;i<st.length();i++)
	{
		
		if(i==0)// fetching the first letter 
		{
			System.out.println(st.charAt(i));
		}
		
		if(i==st.length()-1)//fetching the last letter 
		{
			System.out.println(st.charAt(i));
		}
		
		//if there is a space inbetwee the words 
		
		if(st.charAt(i)==' ')
		{
			//        letter before the space       letter after the space 
			System.out.println(st.charAt(i-1) + ""+ st.charAt(i+1));
		}
	}
	}
}
