package conversionn;

import java.util.ArrayList;

public class c2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(30);
		l.add(10);
		l.add(4);
		l.add(10);
		System.out.println(l);
		
		Integer[]a= new Integer[l.size()];
		Integer[] c = l.toArray(a);
		for(int x:c)
		{
			System.out.println(x);
		}
	}
}
