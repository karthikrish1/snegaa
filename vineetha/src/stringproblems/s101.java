package stringproblems;

import java.util.Scanner;

public class s101 {

	public static void main(String[] args) {
		//0000111->    1111
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1 = s.nextLine();
	String s2 = remove(s1);
	System.out.println(s2);
	}
	
	public static String remove(String s)
	{
		int i=0;
		while(i<s.length() && s.charAt(i)=='0')
		{
			i++;
		}
	    StringBuffer sb= new StringBuffer(s);
	    sb.replace(0, i, "");
	    return sb.toString();
	}
}
