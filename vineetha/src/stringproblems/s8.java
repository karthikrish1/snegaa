package stringproblems;

import java.util.Arrays;

public class s8 {
public static void main(String[] args) {
		//anagram          :listen   = silent
		char []c1= {'l','i','s','t','e','n'};
		char []c2= {'s','i','l','e','n','t'};
		
		// e i  l  n s t
		// e i  l  n  s t
		boolean result = checking(c1,c2);
		
		if(result==true)
		{
			System.out.println("anagrams");
		}
		else
		{
			System.out.println("they are not");
		}}
	public static boolean checking(char[] c1, char[] c2)
	{
		
		int n1=c1.length;
		int n2=c2.length;
		
		if(n1!=n2)
			return false;
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<n1;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
		
		
	}
}
