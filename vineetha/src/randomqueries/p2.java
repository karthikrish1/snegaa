package randomqueries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p2 {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(5,7,8,8,9,7,6,5,4);
		System.out.println(l);
		
		List<Integer> result = l.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
		
		//checking: boolean
		// only even numbers 
	}

}
