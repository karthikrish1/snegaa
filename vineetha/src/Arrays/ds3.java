package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class ds3 {
public static void main(String[] args) {
		int a[]= {3,4,5,6,7,2,2,0,3,1};
		System.out.println(Arrays.toString(a));
		fil(a);
	
	}

public static void fil(int a[])
{
	TreeSet<Integer>h= new TreeSet<>();
	
	//iterate through the array values
	for(int i=0;i<a.length;i++)
	{
		if(!h.contains(a[i]))
		{
			h.add(a[i]);
			System.out.println(a[i]);//printing the array
		}
	}
	
	System.out.println(h);//value in set 
	
	}

}
