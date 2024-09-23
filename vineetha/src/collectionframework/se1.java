package collectionframework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class se1 {
	public static void main(String[] args) {
		//statck
		/*
		 *LIFO
		 *push
		 *pop
		 *stack is emptu: -1 
		 * 
		 * 
		 * */
		Stack<Integer>s= new Stack<>();
		s.push(9);
		s.push(20);
		s.push(40);
		s.push(50);
		System.out.println(s);
		s.pop();// remove top element in stack
		System.out.println(s);
		
		System.out.println(s.peek());//top of the stack 
		
		//s.search(3);
		System.out.println(s.search(20));// position of element in stack
		//top: 1  second top: 2........
		
	    for(int x:s)
	    {
	    	System.out.println(x);
	    }
	    
	    System.out.println("using iterator method");
	    
	   Iterator<Integer> m = s.iterator();
	   while(m.hasNext())
	   {
		   System.out.println(m.next());
	   }
	   
	   //listiterator
	   // hasprivous => checking
	   // previous: reading
	   
	   
	   System.out.println("using list iterator");
	  ListIterator<Integer> d = s.listIterator(s.size());
	  while(d.hasPrevious())
	  {
		 Integer l = d.previous();
		 System.out.println(l);
	  }
	}

}
