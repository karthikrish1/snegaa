package stringproblems;

import java.util.Scanner;

public class o3 {
public static void main(String[] args) {
	
	//im 20, im from 15 car street => 35
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the word");
	String w = s.nextLine();
	System.out.println(addition(w));
}

public static int addition(String w)
{
	int l=w.length();
    int add=0;
    String t="";
    for(int i=0;i<l;i++)
    {
    	if(Character.isDigit(w.charAt(i)))
    	{
    		//next one is also a digit 
    		if(i<l-1 && Character.isDigit(w.charAt(i+1)))
    		{
    			t+=w.charAt(i);  // first character : t
    			
    		}
    		else
    		{
    			t+=w.charAt(i);
    			add+=Integer.parseInt(t);
    			t="";
    		}
    	}
    	
    }
    return add;
}
}
