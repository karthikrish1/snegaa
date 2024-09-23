package Arrays;

import java.util.Arrays;

public class s2 {
// sum of overlapping 
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6};
		int n=a.length;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Sum of overlapping element "+ s2.sum(a, b, n));
	}
	
	public static int sum(int a[], int b[], int n)
	{
		int total=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					total+=2*a[i];
				}
			}
		}
		return total;
	}
	
	
	
	
}
