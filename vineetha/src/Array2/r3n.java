package Array2;

import java.util.ArrayList;
import java.util.Arrays;

public class r3n {
	public static void main(String[] args) {
		
		ArrayList<Integer>a=new ArrayList<>(Arrays.asList(1,-2,3,4,8,9));
		a.removeIf(x-> x%3!=0);
		System.out.println(a);
		int sum=0;
		//iterating through index 
		for(int i=0;i<a.size();i++)
		{
			sum+=a.get(i);
		}
		// create a list of positive and negative integets
		// remove elements which are divisible by 3
		System.out.println(sum);
		
		
		// filter all the elements that are greater than 4 and divisible by 3
		// product of all => greater than 4
		
		ArrayList<Integer>b=new ArrayList<>(Arrays.asList(1,-2,3,4,8,9));
		b.removeIf(x-> x<4);// removing elements that are less thann4 
		//b.removeIf(x-> x%3!=0);
		System.out.println(b);// values that are greater than 4=> multiplication
		int prod=1;
		//iterating through the elements 
		
		for(int x:b)
		{
			prod*=x;
		}
		System.out.println(prod);
		
		//list of even numbers : 2 to 20
		// filter the numbers which are greater than 10
		// filter the numbers that are divisible by 3
		
		// find its product
		// use enhanced for loop
		
		// find sum
		// use normal loop
		
		
		
		
	}

}
