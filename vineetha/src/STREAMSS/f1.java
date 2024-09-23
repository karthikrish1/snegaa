package STREAMSS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class f1 {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(2,3,4,5,6);
		List<Integer> v = l.stream().filter(x-> x>3).collect(Collectors.toList());
		System.out.println(v);
		
		//filter all the odd numbers
		List<Integer> odd = l.stream().filter(x-> x%2!=0 && x==3).collect(Collectors.toList());
		System.out.println(odd);
		
		List<Integer> even = l.stream().filter(x-> x%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		// divisible by 3, print odd numbers, divisile by 5
		
		List<String> l5 = Arrays.asList("hi","hello","bye");
		List<String> t = l5.stream().filter(x->x.startsWith("h")).collect(Collectors.toList());
		System.out.println(t);
		
		List<Character> l6 = Arrays.asList('2','a','c');
		List<Character>v1=l6.stream().filter(Character::isLetter).collect(Collectors.toList());
		System.out.println(v1);
		List<Character>v11=l6.stream().filter(Character::isDigit).collect(Collectors.toList());
		
		System.out.println(v1);
		System.out.println(v11);
		
		List<String> l14 = Arrays.asList("hi","hello","","bye");
		List<String> g = l14.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());
	
		System.out.println(g);
		// create a list of integers=> filter the elements that are greater than 10 and divisible by 2
		
		//create a string => starts with m , ends with m
		//{MaM, DaD, MalayalaM}
		
		
		
		
		
	}

}
