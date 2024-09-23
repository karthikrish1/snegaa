package conversionn;

import java.util.ArrayList;
import java.util.Vector;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>l= new ArrayList<>();
		l.add(3);
		l.add(30);
		l.add(40);
		l.add(3);
		System.out.println(l);
		
		Vector<Integer>v= new Vector<>();
		v.addAll(l);
		System.out.println(v);
	}

}
