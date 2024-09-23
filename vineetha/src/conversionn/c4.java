package conversionn;

import java.util.ArrayList;

public class c4 {

	public static void main(String[] args) {
		ArrayList<Integer>l= new ArrayList<>();
		l.add(30);
		l.add(10);
		l.add(4);
		l.add(10);
		System.out.println(l);
		
		int[] a = l.stream().mapToInt(i->i).toArray();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
