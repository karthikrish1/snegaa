package conversionn;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>v= new Vector<>();
		v.add(3);
		v.add(4);
		v.add(10);
		v.add(30);
		System.out.println(v);
		
		List<Integer>l= new ArrayList<>(v);
		//iterating through the list
		
		for(int x:l)
		{
			System.out.println(x);
		}
	}

}
