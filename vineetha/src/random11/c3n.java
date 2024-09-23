package random11;

import java.util.LinkedHashSet;
import java.util.Set;

public class c3n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1[]= {"abc","def","abc"};
		String s2[]= {"hi","abc","def","abc","how"};
		result(s1,s2);
	}
	
	public static void result(String[] s1, String s2[])
	{
		
		// integer array
		// Treeset 
		Set<String>st1= new LinkedHashSet<>();
		Set<String>st2= new LinkedHashSet<>();
		
		for(String x:s1)
		{
			st1.add(x);// all the elements of s1 => st1
		}
		
		for(String x:s2)
		{
			st2.add(x);// all the elements of s2 => st2
		}
		System.out.println(st1);
		System.out.println(st2);
		
		st1.retainAll(st2);
		System.out.println("commmon elements : "+ st1);
	}

}
