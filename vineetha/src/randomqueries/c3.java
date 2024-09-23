package randomqueries;

import java.util.HashMap;

public class c3 {

	public static void main(String[] args) {
		
		String s="Hi good mrng good night";
		String[] r = s.split(" ");
		HashMap<String, Integer>h= new HashMap<String,Integer>();
		for(int i=0;i<r.length;i++)
		{
			if(h.containsKey(r[i]))
			{
				Integer c = h.get(r[i]);
				h.put(r[i], c+1);
			}
			
			else
			{
				h.put(r[i], 1);
			}
		}
		
		System.out.println(h);
	}
}
