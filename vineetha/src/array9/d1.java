package array9;

import java.util.Arrays;
import java.util.Collections;

public class d1 {
	public static void main(String[] args) {
		Double a[]= {30.5,1.90,4.80,0.5};
		for(double x:a)
		{
			System.out.println(x);
		}
		
		//sorting sub array in ascending 
		
		Arrays.sort(a,0,3,Collections.reverseOrder());
		
		System.out.println("after sorting");
		for(double x:a)
		{
			System.out.println(x);
		}
	}

}
