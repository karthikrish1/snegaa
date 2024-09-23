package array9;

import java.util.Arrays;
import java.util.Collections;

public class desc1 {
public static void main(String[] args) {
	
	Integer a[]= {30,90,80,70};
	for(int x:a)
	{
		System.out.println(x);
	}
	
	Arrays.sort(a,Collections.reverseOrder());
	
	System.out.println("after sorting");
	for(int x:a)
	{
		System.out.println(x);
	}
	
	
	Character a1[]= {'c','d','a'};
	for(char x:a1)
	{
		System.out.println(x);
	}
	
	Arrays.sort(a1,Collections.reverseOrder());
	
	System.out.println("after sorting");
	for(char x:a1)
	{
		System.out.println(x);
	}
}
}
