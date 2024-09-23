package conversionn;

import java.util.ArrayList;
//method1
public class c1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(30);
		l.add(10);
		l.add(4);
		l.add(10);
		System.out.println(l);
		
		Object[] c = l.toArray();// 30,10,4,10
		
		for(Object x:c)
		{
			System.out.println(x);
		}
		
	}
}
