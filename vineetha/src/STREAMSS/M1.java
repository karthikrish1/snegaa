package STREAMSS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M1 {

	public  void main() {
		//https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1549
		//List<Integer>f 11= Arrays.asList(2,3,5,6,7,8,1,23,5);
		//map: common operation to each and every element present in a list
		// number of elements in input list== number of elements in output list
		// modified values
		//List<Integer> r = f.stream().map(x-> x+10).collect(Collectors.toList());
		//System.out.println(r);
		
		//List<Double> r1 = f.stream().map(x->Math.sqrt(x)).collect(Collectors.toList());
		
		//System.out.println(r1);
		
       // List<Double> r11 = f.stream().map(Math::sqrt).collect(Collectors.toList());
		

		//System.out.println(r11);
		
		//List<String> fruits = Arrays.asList("apple","Orange","PEeach");
		//List<String> b = fruits.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
		//System.out.println(b);
		
		//List<Integer> b1 = fruits.stream().map(String::length).collect(Collectors.toList());
		//System.out.println(b1);
		
		
		// character present at 0
		// List<Character> v = fruits.stream().map(x-> x.charAt(0)).collect(Collectors.toList());
	//	System.out.println(v);
		
		// index of a
		//List<Integer> v1 = fruits.stream().map(x-> x.indexOf('a')).collect(Collectors.toList());
		//System.out.println(v1);
		
		
		// List<String> v11 = fruits.stream().map(x-> x+"bye").collect(Collectors.toList());
		//System.out.println(v11);
		
		// List<String> v12 = fruits.stream().map(x-> x.replace('a', 'z')).collect(Collectors.toList());
		//System.out.println(v12);
		
		//List<Boolean> tr = fruits.stream().map(x-> x.contains("e")).collect(Collectors.toList());
		//System.out.println(tr);
		
		//List<String> y1 = fruits.stream().map(x-> x.substring(0, 3)).collect(Collectors.toList());
		//System.out.println(y1);
		
		
		
		//cbrt
		
		
	}
}
