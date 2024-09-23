package randomqueries;

import java.util.LinkedList;

public class p1 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer>l= new LinkedList<>();
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		

		LinkedList<Integer>nl= new LinkedList<>();
		
		//reverse
		l.descendingIterator().forEachRemaining(nl::add);
		
		System.out.println(nl);
		
		//merging
		
		LinkedList<Integer>result= new LinkedList<>(l);  // elements of l -> added to result
		System.out.println(result);
		result.addAll(nl);
		System.out.println(result);
		
		
	}

}
