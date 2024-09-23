package regularexpressions;

import java.util.HashSet;
import java.util.Set;

public class f7 {

	public static void main(String[] args) {
		
		String n="hi vinitha hi";
		String[] words = n.split("\\W");
		for(String x: words)
		{
			System.out.println(x);
		}
		int n1=words.length;
		Set<String>s= new HashSet<>();
		
		for(int i=0;i<n1-1;i++)
		{
			for(int j=1;j<n1;j++)
			{
				if(words[i].equals(words[j])&& i!=j)
				{
					s.add(words[i]);
				}
			}
		}
		
		System.out.println(s);
	}
}
