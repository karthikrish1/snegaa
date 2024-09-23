package randomqueries;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class q2 {

	public static void main(String[] args) {
		
		//    key, element 
		// keys: will be sorted 
		
		// sort hashap=> convert itinto a treemap
		HashMap<Character,Integer>h= new HashMap<>();
		h.put('x', 0);
		h.put('a', 40);
		h.put('c', 120);
		h.put('f', 4000);
		h.put('d', 140);
		System.out.println(h);
		
		// natural order:  TreeMap
		
		Map<Character,Integer>t= new TreeMap<>(h);
		System.out.println(t);
		
	}
}
