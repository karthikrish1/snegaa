package conversionn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class d4 {

	public static void main(String[] args) {
		//list-> set
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(80);
		l.add(30);
		l.add(40);
		l.add(30);
		System.out.println(l);
		
		//method1 
		HashSet<Integer>j= new HashSet<>();
		
		l.forEach(value->{j.add(value);});
		
		System.out.println(j);
		
		//method2
		
		HashSet<Integer>j1= new HashSet<>(l);
		System.out.println(j1);
		
		//method 3
		
		HashSet<Integer>j2= new HashSet<>();
		j2.addAll(l);
		System.out.println(j2);
		
		
		//method 4
		Set<Integer> j3 = l.stream().collect(Collectors.toSet());
		System.out.println(j3);

	}

}
