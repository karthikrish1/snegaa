package conversionn;

import java.util.HashSet;

public class js {
public static void main(String[] args) {
	
	HashSet<String>h= new HashSet<>();
	h.add("hi");
	h.add("hello");
	h.add("are");
	h.add("you?");
	System.out.println(h);
	
	String s[]= new String[h.size()];
	int i=0;
	//iterating rthrough the set and adding elements in the array
	for(String x:h)
	{
		s[i++]=x;
	}
	
	//print the array
	
	for(String x:s)
	{
		System.out.println(x);
	}
	
	String s1[]= new String[h.size()];
	//method 2
	h.toArray(s1);
	
	System.out.println("Second method ");
	for(String x:s1)
	{
		System.out.println(x);
	}
	
	
}
}
