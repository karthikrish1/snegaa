package conversionn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String a[]= {"hi","hello","how","apple"};
				System.out.println(Arrays.toString(a));
				System.out.println(result(a));
				
				//float array
				// 
	}
	
	public static Set<String>result(String []a)
	{
		Set<String>s= new TreeSet<>();
		Collections.addAll(s, Arrays.toString(a));
		return s;
	}

}
