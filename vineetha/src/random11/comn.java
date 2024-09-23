package random11;

import java.util.HashSet;

public class comn {
public static void main(String[] args) {
	
	String s1[]= {"abc","def","abc"};
	String s2[]= {"hi","abc","def","abc","how"};
	result(s1,s2);
}

public static void result(String s1[], String s2[])
{
	
	HashSet<String >s= new HashSet<>();
	for(int i=0;i<s1.length;i++)
	{
		for(int j=0;j<s2.length;j++)
		{
			if(s1[i]==s2[j])
			{
				s.add(s1[i]);
				break;
			}
		}
	}
	
	System.out.println(s);
	}
}
