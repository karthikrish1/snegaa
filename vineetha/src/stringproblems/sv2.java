package stringproblems;

import java.util.Scanner;

public class sv2 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the sentence ");
	String st = s.nextLine();
	printing(st);
}

public static void printing(String st)
{
	st=st+" ";
	for(int i=1;i<st.length();i++)
	{
		if(st.charAt(i)==' ')
		{
			System.out.println(st.charAt(i-1));
		}
	}
	}
}
