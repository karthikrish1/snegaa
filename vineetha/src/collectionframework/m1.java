package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {
	public static void main(String[] args) {
		
		/*
		 * map: container where elements wll be stored along with its key
		 * 
		 * element: any datatype
		 * key: any datatype
		 * add
		 * remove
		 * retrive
		 * iterate
		 * 
		 * TreeMap:            keys: naturak order
		 * LinkedHashMap       keys: insertion order
		 * HashMap             keys: unpredictable order 
		 * 
		 * 
		 * TreeMap<datatypeofkey, dtatyeofeelmenet> name= new TreeMap<>();
		 * 
		 * */
		
		TreeMap<Double,Character>t= new TreeMap<>();
		t.put(3.4, 'a');
		t.put(0.4, 'z');
		t.put(19.3, 'd');
		t.put(34.4, 'x');
		t.put(0.1, 'y');
		//cannt duplicate a key
		t.put(3.4, 'd');
		System.out.println(t);
		
		
		LinkedHashMap<Double,Character>t1= new LinkedHashMap<>();
		t1.put(3.4, 'a');
		t1.put(0.4, 'z');
		t1.put(19.3, 'd');
		t1.put(34.4, 'x');
		t1.put(0.1, 'y');
		System.out.println(t1);
		
		HashMap<Double,Character>t11= new HashMap<>();
		t11.put(3.4, 'a');
		t11.put(0.4, 'z');
		t11.put(19.3, 'd');
		t11.put(34.4, 'x');
		t11.put(0.1, 'y');
		System.out.println(t11);
		
	}

}
