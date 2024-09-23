package stringproblems;

import java.util.Scanner;

public class sw1 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the sentence");
	String word = s.nextLine();
	System.out.println(swapping(word));
	
	
}

public static String swapping(String w)
{
	if(w.length()<2)
	{
		return w;
	}
	
	char[] c = w.toCharArray();//  [v i n i t h a]
	char temp=c[0];          // temp=v
	c[0]=c[c.length-1];      // c[0]=a
	
	c[c.length-1]=temp;      // c[last]=v
	
	return String.valueOf(c);
}
}
