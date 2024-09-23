package array9;

import java.util.Arrays;
import java.util.Comparator;

public class s2 {
public static void main(String[] args) {
	String s[]= {"lem","orange","grapes","apple","kiwi"};
	for(String x:s)
	{
		System.out.println(x);
	}
	
	Arrays.sort(s,Comparator.comparing(String::length));
	
	System.out.println("After sorting");
	
	for(String x:s)
	{
		System.out.println(x);
	}
}
}
