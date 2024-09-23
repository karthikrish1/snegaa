package Array2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ms {
public static void main(String[] args) {
	int a[]= {1,1,2,3,4,5,5,6,6,7,7,7};
	System.out.println(Arrays.toString(a));
	int n=a.length;
	// sum of maximum occuring element 
	System.out.println(sum(a,n));
	
}

public static int sum(int a[], int n)
{
	//store the frequency
	
	Map<Integer,Integer>m= new HashMap();   // element, frequency
	
	for(int i=0;i<n;i++)
	{
		if(m.containsKey(a[i]))  // element is repeating : if will be executed 
		{
			m.put(a[i],m.get(a[i])+1);     // 30      3   // storing the element, frequency
		}
		
		else
		{
			m.put(a[i], 1);
		}
	}
	
	System.out.println(m);
	int max=0;
	for(Map.Entry<Integer, Integer> x:m.entrySet())
	{
		
		if (x.getValue() > max)   //checking max with each and evry occurance of elemen t
		{
			max=x.getValue();    // finding out the maximum freuqncey
		}
	}
	
	int sum=0;
	for(Map.Entry<Integer, Integer> x:m.entrySet())
	{
		if (x.getValue() ==max)
		{
			sum+=x.getKey()*max;
		}
	}
	return sum;
	}

}
