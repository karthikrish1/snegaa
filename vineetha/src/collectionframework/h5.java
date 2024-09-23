package collectionframework;

import java.util.Hashtable;

public class h5 {
	public static void main(String[] args) {
		//HAshmp: different order for each time
		//HAshtable: first order will be maintained
		
		
		// key: Float    element: String 
		
		Hashtable<Double,Character>t= new Hashtable<>();
		t.put(3.4, 'a');
		t.put(0.4, 'z');
		t.put(19.3, 'd');
		t.put(34.4, 'x');
		t.put(0.1, 'y');
		
		//remove: know the key
		t.remove(0.1);
		System.out.println(t);
		
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
		
	}

}
