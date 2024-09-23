package conversionn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class d1 {

	public static void main(String[] args) {
		// map-> List
		
		HashMap<String,Integer>m=new HashMap<>();
		m.put("apple", 90);
		m.put("pineapple", 990);
		m.put("cat", 10);
		m.put("kiwi", 80);
		m.put("banana", 0);
		System.out.println(m);
		
		//getting keys alone from the map
		
		Set<String> k = m.keySet();
		
		ArrayList<String>l= new ArrayList<>(k);
		System.out.println("key list");
		System.out.println(l);
		
		 Collection<Integer> v = m.values();
		
		ArrayList<Integer>l1= new ArrayList<>(v);
		System.out.println("Element list");
		System.out.println(l1);

	}

}
