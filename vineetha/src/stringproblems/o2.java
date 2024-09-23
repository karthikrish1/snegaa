package stringproblems;

import java.util.Scanner;

public class o2 {

	public static void main(String[] args) {
		
		//hi  => hhii
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word");
		String w = s.nextLine();
		System.out.println(result(w));
	}
	
	public static String result(String w)
	{
		String ns="";
		
		int l=w.length();
		for(int i=0;i<l;i++)
		{
			 ns+=w.substring(i,i+1)+w.substring(i,i+1);
		}
		return ns;
	}
}
