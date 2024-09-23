package random11;

import java.util.Stack;
import java.util.Vector;

public class cw1 {
public static void main(String[] args) {
	Vector<String>v= new Vector();
	v.add("apple");
	v.add("orange");
	v.add("orange");
	v.add("kiwi");
	System.out.println(v);
	System.out.println(after(v));
}

public static int after(Vector<String> v)
{
	Stack<String>s= new Stack();
	
	for(int i=0;i<v.size();i++)
	{
		if(s.isEmpty()) {
			s.push(v.get(i));
		}
		
		else
		{
			String s1=s.peek();
			if (s1.equals(v.get(i)))
			{
				s.pop();
			}
			else
			{
				s.push(v.get(i));
			}
		}
	}
	
	return s.size();
	}
}
