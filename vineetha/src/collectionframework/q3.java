package collectionframework;

import java.util.ArrayDeque;

public class q3 {

	public static void main(String[] args) {
		
		ArrayDeque<Character>g= new ArrayDeque<>();
		//double ended queue
		g.add('d');
		g.add('f');
		g.add('a');
		g.add('p');
		g.add('e');
		System.out.println(g);
		g.addFirst('a');
		g.addLast('x');
		System.out.println(g);
		
		//g.remove();//first
		//g.removeFirst();
		//g.removeLast();
		g.remove('p');
		System.out.println(g);
		
		//retriving first element 
		System.out.println(g.getFirst());
		
		System.out.println(g.peek());
		System.out.println(g.peekFirst());
		
		//retriving last element 
		System.out.println(g.peekLast());
		System.out.println(g.getLast());
		
		//poll
		System.out.println(g.poll());//first 
		System.out.println(g.pollFirst());//first element 
		System.out.println(g.pollLast());//last element 
		
		System.out.println(g);
		g.pop();//first element 
		System.out.println(g);
		
		for(char x:g)
		{
			System.out.println(x);
		}
		
	}
}
