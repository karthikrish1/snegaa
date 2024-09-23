package stringproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class s5 {
	//method5: using list iterator
	
	//hasnext
	// next
	
	public static void main(String[] args) {
		String n="hello";
		char[] a = n.toCharArray();
		
		List<Character>l= new ArrayList<>();
		
		for(char x:a)
		{
			l.add(x);
			
		}
		
		Collections.reverse(l);
		
		//Collections.
	//metho1
		System.out.println(l);
    //method2:
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	//method3:	
		for(char x: l)
		{
			System.out.println(x);
		}
	//method4: 
		ListIterator<Character> li = l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}
