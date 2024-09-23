package Arrays;

import java.util.ArrayList;

public class r34 {

	public static void main(String[] args) {
		int a[]= {2,3,3,3,4,5,6,3};
		
		int ele=3;
		ArrayList<Integer>l= new ArrayList<>();
		for(int index=0;index<a.length;index++)
		{
			if(a[index]!=ele)
			{
				l.add(a[index]);
			}
		}
		
		System.out.println(l);
	}
}
