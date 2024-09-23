package meanmedian;

import java.util.Arrays;

public class m1 {

	public static void main(String[] args) {
		
		// mean=> sum of all the numbers/total number of elements 
		
		//sort the array
		//number of elements : odd => return middle value 
		// number of elements: even: average f 2 middle values     
		
		// 11  =>    median  6     1  2  3   4   5    6-median    7 8 9 10   11
		// 10  =>                  1   2   3   4       (5 +  6)/2          7   8   9  10
		
		int a[]= {10,20,30,40,50,10};// 10 10 20 30 40 50
		System.out.println(Arrays.toString(a));
		int n=a.length;
		System.out.println(m1.mean(a,n));
		System.out.println(m1.median(a, n));
	}
	
	// double 
	public static int mean(int a[], int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		
		return sum/n;
	}
	
	public static int median(int a[], int n)
	{
		Arrays.sort(a);
		if(n%2!=0)
		{
			return a[n/2];
		}
		else
		{
			return (a[(n-1)/2]+a[n/2])/2;   /// 2 middle values 
		}
		
	}
	
}
