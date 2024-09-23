package Arrays;

import java.util.ArrayList;

public class i2 {
	public static void main(String[] args) {
		
		int a[]= {3,4,5,40,90,320};
		System.out.println("index of 320 is "+ i2.id(a, 320));
	}
	
	public static int id(int a[], int t)// array, desiredindex 
	{
		ArrayList<Integer>l= new ArrayList<>();
		for(int x:a)
		{
			l.add(x);
			
		}
		return l.indexOf(t);
		
		// charAt(index)
	}

}
