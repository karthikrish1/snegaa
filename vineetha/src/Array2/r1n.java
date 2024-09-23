package Array2;

import java.util.ArrayList;
import java.util.Arrays;

public class r1n {

	public static void main(String[] args) {
		
		int a[]= {-1,1,2,3,-9,0};
		System.out.println(Arrays.toString(a));
		removenegatives(a);
	}
	
	public static void removenegatives(int a[])
	{
		ArrayList<Integer>l= new ArrayList<>();
		for(int x:a)
		{
			if(x>=0)//filtering the positive values 
			{
				l.add(x);
			}
		}
		
		for(int x:l)
		{
			System.out.println(x);
		}
		
	}
}
