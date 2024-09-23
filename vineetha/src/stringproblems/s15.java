package stringproblems;

import java.util.Scanner;

public class s15 {
public static void main(String[] args) {
	//rgex : [^a-zA-z0-9]
	
	//nonalphanumeric=> Symbols 
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the string ");
	String s1 = s.nextLine();
	String result=remove(s1);
	System.out.println(result);
}

public static String remove(String s1)
{
	
String s2=s1.replaceAll("[^a-zA-z0-9]", "");
return s2;
}
}
