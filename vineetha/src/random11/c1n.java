package random11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c1n {
public static void main(String[] args) {
	//set of string=> array of string
	
	Set<String>sos=new HashSet<>(Arrays.asList("hi","hello","welcome","bye"));
	System.out.println("set of string "+ sos);
	System.out.println("Array of string "+ Arrays.toString(result(sos)));
}

public static String[] result(Set<String> sos)

{
	String aos[]= new String[sos.size()];// initialising the resultant array
	int i=0;
	
	//iterating through the set of string
	for(String x:sos)
	{
		aos[i++]=x;
	}
	return aos;
			}
}
