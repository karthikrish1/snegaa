package STREAMSS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class r1 {

	public static void main(String[] args) {
		
		List<Integer> g = Arrays.asList(1,10,9,80,3);
		System.out.println(g);
		
	 Integer t = g.stream().reduce(0,(ans,i)-> ans+i);
	 System.out.println(t);
	 
	 Integer t1 = g.stream().filter(x-> x>5).reduce(1,(ans,i)-> ans*i);
	 System.out.println(t1);
	 
	 //   0,10 -> 10
	 //   10,80-> 90
	
		
	Optional<Integer> c = Arrays.asList(3,4,5,6).stream().reduce(Math::max);
	System.out.println(c);
	
	Optional<Integer> c1 = Arrays.asList(3,4,5,6).stream().reduce(Math::addExact);
	System.out.println(c1);
	
		
	
	Optional<Integer> c11 = Arrays.asList(3,4,5,6).stream().reduce(Math::multiplyExact);
	System.out.println(c11);
	
	
	//integer=> [3,6,9,12]
	//map: add 10 to each and every element
	//filter: even and also less than 5
	// reduct: addition of all the element vc 
	
	
	}
}
