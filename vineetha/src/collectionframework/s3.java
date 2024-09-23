package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>t= new TreeSet<>();
		t.add("zoo");
		t.add("ant");
		t.add("cat");
		t.add("dog");
		t.add("banana");
		t.add("xylophone");
		System.out.println(t);
		
		
		//remove
		t.remove("ant");
		System.out.println(t);
		
		//t.clear();
		
		//retriving first and last element of set
		System.out.println(t.first());
		System.out.println(t.last());
		
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t);
		
		for(String x:t)
		{
			System.out.println(x);
		}
		
		//Iteartor=. iterator(), hasnext(), next()
		
		// applicable for queue
		
		Iterator<String> f = t.iterator();
		//hasnext=> checking 
		// next => read the element
		while(f.hasNext())
		{
			System.out.println(f.next());
		}
		
		/*first time f points to first element in set    f points to cat :   read cat => print
		 * second time f points to seconds element in set                :   read dog-> print
		 * third time  f points to third element                         : read xylophone => print
		 * fourth time  f points to nulll    f.hasnext=> loop terminated
		 *    
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *list                                   queue                                set 
		 * 
		 * index based                         not indexed                            not indexed
		 * add                                add                                      add
		 * remove                             remove                                   remove
		 * retrival: any                       retrial: first, last                   set: first , last
		 * iteration
		 * nrml                                for each, iterator                     fr eac, ioterator
		 * for each
		 * linkedlist, arraylist            ab, pro, deque                             treeset,lh,hsh
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}

}
