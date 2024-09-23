package conversionn;

import java.util.ArrayList;
import java.util.Arrays;

public class c3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(30);
		l.add(10);
		l.add(4);
		l.add(10);
		System.out.println(l);
		
		Integer a[]= new Integer[l.size()];
		
		for(int i=0;i<l.size();i++)
		{
			a[i]=l.get(i);
		}
		
		System.out.println(Arrays.toString(a));
	}

}
