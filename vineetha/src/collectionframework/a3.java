package collectionframework;

import java.util.ArrayList;

public class a3 {
	public static void main(String[] args) {
		
		ArrayList<Boolean>l= new ArrayList<>();
		//       Character 
		
		
		l.add(true);
		l.add(false);
		l.add(false);
		l.add(true);
		l.add(false);
		System.out.println(l);
		
		// index    0    1     2     3      4
		
		//        true  false false  true   false 
		
		l.remove(4);
		System.out.println(l);
		
		System.out.println(l.get(0));
		
	}

}
