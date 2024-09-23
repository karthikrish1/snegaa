package conversionn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"hi","hello","how"};
		System.out.println(Arrays.toString(a));
		System.out.println(result(a));
	}
	
	// double array
	// LinkedHashset 
	
	public static Set<String>result(String[] a)
	{
		Set<String>s= new HashSet<>(Arrays.asList(a));
		return s;
	}

}
