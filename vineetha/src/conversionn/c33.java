package conversionn;

import java.util.HashMap;

public class c33 {
	public static void main(String[] args) {
		
		String s[]= {"dhivya","hi"};
		int id[]= {1,2};
		HashMap<Integer,String>h= new HashMap<>();
		for(int i=0;i<s.length;i++)
		{
			h.put(id[i], s[i]);
		}
		
		System.out.println(h);
		
	}

}
