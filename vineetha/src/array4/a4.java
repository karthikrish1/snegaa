package array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class a4 {

	public static void main(String[] args) {
		
		
		//sort elements in descending order
		
		String a[]= {"banana","apple","ginger","zebra"};
		int n1=a.length;
		System.out.println("original");
		System.out.println(Arrays.toString(a));
		System.out.println("alphabetical order");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("reverse");
		Arrays.sort(a,Collections.reverseOrder());//string and alphabets
		System.out.println(Arrays.toString(a));
		
		
		//ArrayList<Integer>n=new ArrayList<>(Arrays.asList(3,4,5,6));
		//Collections.reverse(n);// list=> reverse 
		//System.out.println(n);
		
		Integer n[]= {10,20,30};// initialisation of array
		Collections.reverse(Arrays.asList(n));// reversing as a list 
		System.out.println(Arrays.toString(n));//printing as an array
		
		
	}
}
