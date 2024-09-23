package conversionn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class c9 {

	//set of string to set of integer in java
	public static void main(String[] args) {
		Set<String>sos= new HashSet<>(Arrays.asList("10","20","30","40"));
		System.out.println("Set of sTring "+ sos);
		
		List<Integer> reult = sos.stream().map(s-> Integer.parseInt(s)).collect(Collectors.toList());
		
		
		Set<Integer> reultq = sos.stream().map(s-> Integer.parseInt(s)).collect(Collectors.toSet());

		System.out.println(reult);
		System.out.println(reultq);
	}

}
