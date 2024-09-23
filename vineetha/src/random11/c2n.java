package random11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c2n {
public static void main(String[] args) {
	
	Set<String>sos=new HashSet<>(Arrays.asList("hi","hello","welcome","bye"));
	System.out.println("set of string "+ sos);
	System.out.println(Arrays.toString(result(sos)));
}

public static String[] result(Set<String>sos)
{
	
	//String[] r = sos.toArray(new String[0]);
	
	 String[] r = Arrays.copyOf(sos.toArray(),sos.size(),String[].class);
	return r;
	}
}
