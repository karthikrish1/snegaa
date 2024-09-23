package collectionframework;

import java.util.TreeMap;

public class m3 {
	public static void main(String[] args) {
		
		TreeMap<Double,Character>t= new TreeMap<>();
		t.put(3.4, 'a');
		t.put(0.4, 'z');
		t.put(19.3, 'd');
		t.put(34.4, 'x');
		t.put(0.1, 'y');
		
		//remove: know the key
		t.remove(0.1);
		System.out.println(t);
		//t.pollFirstEntry();
		t.pollLastEntry();
		System.out.println(t);
		
		System.out.println(t.get(3.4));
		System.out.println(t.keySet());
		System.out.println(t.values());
		t.replace(0.4, 'z', 'A');
		System.out.println(t);
		System.out.println(t.containsKey(0.9));
		System.out.println(t.containsValue('a'));
		
		//iterate through the keys
		//during iterateion
		// fetch the element
		
		for(double x: t.keySet())
		{
			System.out.println(x+":"+ t.get(x));
		}
		
		/*
		 * 
		 * [0.4, 3.4, 19.3]
		 * 
		 * firt    x:0.4      0.4: t.get(0.4)
		 * second  x: 3.4      3.4:t.get(3.4)
		 * third   x: 19.3     19.3: t.get(19.3)
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
