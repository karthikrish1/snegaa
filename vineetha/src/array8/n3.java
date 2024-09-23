package array8;

import java.util.Arrays;
import java.util.HashSet;

public class n3 {
	
	public static void main(String[] args) {
		
		String n[]= {"hi","good","hello","mrng"};
		String m[]= {"bye","good","night","mrng"};
		
		System.out.println(Arrays.toString(n));

		System.out.println(Arrays.toString(m));
		
		HashSet<String>h= new HashSet<>();
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				
				if(n[i].equals(m[j]))
				{
					//System.out.println("they are equal");
				}
				
				else
				{
					//h.add(m[i]);
				}
				
			}
		}
		
		System.out.println(h);
	}

}
