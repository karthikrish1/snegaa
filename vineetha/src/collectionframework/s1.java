package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {

	public static void main(String[] args) {
		
		/*
		 * set
		 *  not indexed
		 *  add
		 *  remove
		 *  retriving middle element  is not possible
		 *  not accept duplicates
		 *  
		 *  Treeset:   alphabetical/ascendinf order
		 *  linkedHashset: insertion
		 *  Hashset: unpredictable 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		TreeSet<Integer>t= new TreeSet<>();
		t.add(300);
		t.add(2);
		t.add(20);
		t.add(10);
		t.add(50);
		t.add(2);
		System.out.println(t);
		
		
	    LinkedHashSet<Integer>t1= new LinkedHashSet<>();
		t1.add(300);
		t1.add(2);
		t1.add(20);
		t1.add(10);
		t1.add(50);
		System.out.println(t1);
		
		HashSet<Integer>t11= new HashSet<>();
		t11.add(300);
		t11.add(2);
		t11.add(20);
		t11.add(10);
		t11.add(50);
		System.out.println(t11);
	}
}
