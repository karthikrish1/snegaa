package checkingg;

import java.util.HashSet;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class c2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter ur number : ");
	int n=s.nextInt();
	boolean result = checking(n);
	if(result==true)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
}
public static boolean checking(int n)
{
	
	if(n<=0)
	{
		return false;
	}
	HashSet<Character>h= new HashSet<>();
	String c = Integer.toString(n);
	System.out.println(c);
	for(char x:c.toCharArray())
	{
		System.out.println(x);
		if(x=='2'|| x=='3'|| x=='5')
		{
			h.add(x);
			// non 2/3/5 digits 
			System.out.println(x);
		}
		else
		{
			return false;
		}
		
		
	}
	System.out.println(h);
	return h.size()==c.length();
}
}
