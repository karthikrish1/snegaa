package stringproblems;

import java.util.Stack;

public class s7 {
	
	//method7: using stack
	public static void main(String[] args) {
		
		String n="hello";
		char[] d = n.toCharArray();
		Stack<Character>s= new Stack();
		for(char x: d)
		{
			s.push(x);   //  =>        o l l e h
			
		}
		String temp="";
		System.out.println(s);
		while(!s.isEmpty())
		{
			temp+=s.pop();
		}
		
		
		System.out.println(temp);
	}

}
