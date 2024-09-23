package conversionn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[]= {"hi","hello","how"};
		System.out.println(Arrays.toString(a));
		System.out.println(result(a));
	}
	
	public static Set<String> result(String a[])
	{
		Set<String>s= new HashSet<>();
		for(String x:a)
		{
			s.add(x);
		}
		
		return s;
	}

}
