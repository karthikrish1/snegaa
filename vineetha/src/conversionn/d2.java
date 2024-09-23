package conversionn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer>m=new HashMap<>();
		m.put("apple", 90);
		m.put("pineapple", 990);
		m.put("cat", 10);
		m.put("kiwi", 80);
		m.put("banana", 0);
		System.out.println(m);
		
		// key:  integer
		// element: char 
		
		
		//keys to list
		
		ArrayList<String> lk = m.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
		
		ArrayList<Integer> lv = m.values().stream().collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(lk);
		System.out.println(lv);
		
	}

}
