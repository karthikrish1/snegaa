package Arrays;

import java.util.Arrays;

public class nr {

	public static void main(String[] args) {
		int a[]= {2,3,4,2,4,5,6,9};
		System.out.println(Arrays.toString(a));
		int n=a.length;
		System.out.println(nr.fn(a, n));

	}
	
	public static int fn(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			int j;
			for( j=0;j<n;j++)
			{
				if(i!=j && a[i]==a[j])// if elemnet is present in remaining part 
					{
					break;
					}
			}
			
			if(j==n)  
			  
				{
				return i;
				}
		}
	return -1;
	}

}
