package Array2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mn {
public static void main(String[] args) {
	
	int a[]= {2,3,4,5,5,6,7,3,3,4,4,2,1};
	System.out.println(Arrays.toString(a));
	int n=a.length;
	mn ob= new mn();
	System.out.println(ob.sum(a, n));
}

public int sum(int a[], int n)
{
	Map<Integer,Integer>m= new HashMap<>();
	//store the element and its frequence in a map    element, frequency
	
	for(int i=0;i<n;i++)
	{
		m.put(a[i], m.get(a[i])==null ? 1:m.get(a[i])+1);
	}
	int minfre=Integer.MAX_VALUE;
	minfre=Collections.min(m.entrySet(),Comparator.comparingInt(Map.Entry::getKey)).getValue();
	
	int prod=1;
	for(Entry<Integer, Integer> x:m.entrySet())
	{
		if(x.getValue()==minfre)
		{
			prod*=x.getKey()*x.getValue();
		}
	}
	return prod;
	}
}
