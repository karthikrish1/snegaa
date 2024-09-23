package stringproblems;

import java.util.Scanner;

public class s22 {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the sentence ");
	String t = s.nextLine();
	System.out.println(r(t));
}

public static String r(String t)
{
	String[] result = t.split(" ");
	for(int i=0;i<result.length;i++)
	{
		//4,2,6
		// words with odd number of characters 
		if(result[i].length()%2!=0)
		{
			StringBuilder rv= new StringBuilder(result[i]);
			result[i] = rv.reverse().toString();
			
		}
	}
	return String.join(" ", result);
	}
}
