package Array5;

import java.util.ArrayList;
import java.util.HashSet;

public class intes {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,40};
		int b[]= {20,40,89,90};
		System.out.println(intersection(a,b));
		}
	
	public static ArrayList intersection(int a[], int b[])
	{
		//removing duplicates in first array
		HashSet<Integer>h= new HashSet<>();
		for(int x:a)
		{
			h.add(x);  // adding first array elements in set(ignoring the duplicates)
			
		}//{10,20,30,40}  //comparing with {20,40,89,90}  
		
		// add to the list 
		
		ArrayList<Integer>r= new ArrayList<>();
		for(int x:b)// comparing the elements of second array with the set
		{
			if(h.contains(x))
			{
				r.add(x);
				h.remove(x);
			}
		}
		return r;
	}
	}


