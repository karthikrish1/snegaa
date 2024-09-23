package conversionn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c5 {
	public static void main(String[] args) {
		Set<String>sos= new HashSet<>(Arrays.asList("hi","how","are","you"));
		System.out.println("Set of sTring "+ sos);
		System.out.println(Arrays.toString(result(sos)));
	}

	
	public static String[] result(Set<String> sos)
	{
		String[]aos= new String[sos.size()];
		System.arraycopy(sos.toArray(), 0, aos, 0, sos.size());
		return aos;
	}
}
