package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s2 {

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
		
		
	    LinkedHashSet<Character>t1= new LinkedHashSet<>();
		t1.add('g');
		t1.add('m');
		t1.add('o');
		t1.add('h');
		t1.add('a');
		System.out.println(t1);
		
		HashSet<Float>t11= new HashSet<>();
		t11.add(2.3f);
		t11.add(0.9f);
		t11.add(20.4f);
		t11.add(10.4f);
		t11.add(50.3f);
		System.out.println(t11);
		
		// String => datatype 
	}

}
