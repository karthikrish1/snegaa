package Arrays;

import java.util.Arrays;

public class r1 {
	
	//removing an element using arraycopy
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		System.out.println("before deletion");
		for(int x:a)
		{
			System.out.println(x);
		}
		
		int[] b = Arrays.copyOf(a,2);
		
		System.out.println("after deletion");
		
		for(int x:b)
		{
			System.out.println(x);
		}
	}

}
