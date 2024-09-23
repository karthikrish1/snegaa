package stringproblems;

import java.util.Scanner;

public class sw5 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the sentence");
		String word = s.nextLine();
	
		//vinitha
		//2 -> second last
		System.out.println(swapping(word,0,word.length()-1));
		System.out.println(word);
	}
	
	public static String swapping(String w,int i, int j)
	{
		if(w.length()<2)
		{
			return w;
		}
		
		StringBuilder sb= new StringBuilder(w);
		 int first=sb.charAt(0);
		 int last=sb.charAt(sb.length()-1);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, sb.charAt(i));
		return sb.toString();
		
	}

}
