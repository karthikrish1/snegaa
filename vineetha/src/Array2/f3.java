package Array2;

import java.util.Arrays;

public class f3 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,9,8,10};
		int k=2;
		int n=a.length;
		System.out.println(Arrays.toString(a));
		f3 ob= new f3();
		System.out.println("Sum is "+ ob.sum(a, k, n-1));
	}
	
	public int sum(int a[], int k, int i)
	{
		if(i<0)
		{
			return 0;
			
		}
		if(a[i]%k==0)
		{
			return a[i]+ sum(a,k,i-1);
		}
		else
		{
			return 0+ sum(a,k,i-1);
		}
	}
}
