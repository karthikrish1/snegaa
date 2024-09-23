package numbers;

import java.util.Scanner;

public class n23 {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the first number");
	int n1=s.nextInt();
	
	System.out.println("Enter the second number");
	int n2=s.nextInt();
	boolean r=checking(n1,n2);
	System.out.println(r);
	
}

public static boolean checking(int a, int b)
{
	String s1 = String.valueOf(a);//12345
	String s2 = String.valueOf(b);// 123
	
	boolean result;
	result=s1.startsWith(s2);
	return result;
	
}}
