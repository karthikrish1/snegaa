package stringproblems;

import java.util.Scanner;

public class o10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word");
		String w = s.nextLine();
		System.out.println(checking(w));
		
		// ends with a and i
		// hi how are you vinitha 
	}
	
	public static int checking(String w)
	{
		int l=w.length();
		int count=0;
		String r = w.toLowerCase();
		for(int i=0;i<l;i++)
		{
			if(r.charAt(i)=='a' || r.charAt(i)=='i')
			{
				if(i<l-1 && !Character.isLetter(r.charAt(i+1)))
				{
					count+=1;
				}
				else if(i==l-1)
				{
					count+=1;
				}
			}
		}
		return count;
	}

}
