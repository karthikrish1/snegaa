package collectionframework;

import java.util.LinkedList;

public class l1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*either way
		 * 
		 *index based
		 *add
		 *remove
		 *retrive
		 *iteration
		 *addlast
		 *addfist
		 *getfirst
		 *getlast
		 *removefirst
		 *remove
		 * 
		 * 
		 */
		
		LinkedList<Integer>l= new LinkedList<>();
		l.add(30);
		l.add(20);
		l.add(10);
		l.add(80);
		l.add(100);
		//   index     0    1   2    3    4    
		//            30    20  10   80   100
		System.out.println(l);
		l.addFirst(900);
		System.out.println(l);
		//add last , add => same
		l.addLast(440);
		System.out.println(l);
		
		//
		//l.remove();//remove first element
		//l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.get(3));
		
		//iterating through the index
		
		for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println();
		
		for(int x:l)
		{
			System.out.println(x);
		}
		

	}

}
