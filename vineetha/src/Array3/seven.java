package Array3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class seven {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,2,3,3,0};
		int n=a.length;
		System.out.println(Arrays.toString(a));
		System.out.println(sum(a,n));
	}
	
	public static int sum(int a[], int n)
	{
		Map<Integer,Integer>m= new HashMap<>();
		for(int i=0;i<n;i++)
		{
		int c=0;
		if(m.get(a[i])!=null)//counting frequency
		{
			c=m.get(a[i]);
		}
		m.put(a[i], c+1);//storing element and its frequency
		}
		
		int sum=0;
		for(Entry<Integer, Integer> x:m.entrySet())
		{
			if(x.getValue()%2==0)
			{
				sum+=x.getValue()*x.getKey();
			}
		}
		return sum;
	}
}
