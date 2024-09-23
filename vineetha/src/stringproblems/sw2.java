package stringproblems;

import java.util.Scanner;

public class sw2 {
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
	StringBuilder sb= new StringBuilder(w);
	char first = sb.charAt(0);
	
	//setchar at
	sb.setCharAt(0, sb.charAt(sb.length()-1));
	sb.setCharAt(sb.length()-1,first);
	
	return sb.toString();
	
}
}
