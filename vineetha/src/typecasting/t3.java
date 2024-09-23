package typecasting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class t3 {
	
	public static void main(String[] args) {
		
		//list of characters to a string
		List<Character> g = Arrays.asList('v','i','n','i');
		
		String c = g.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(c);
		
		String n="WElcome123";
		List<Character> f = n.chars().mapToObj(v -> (char)v).collect(Collectors.toList());
		System.out.println(f);
		
		
	}

}
