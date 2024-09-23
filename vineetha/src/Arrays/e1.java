package Arrays;

import java.util.Arrays;

public class e1 {

	//distinct 
	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,4,4,4,5,6,7,7,0};
		System.out.println(Arrays.toString(a));
		int n=a.length;
				
	    int i = e1.finding(a, n);
	    System.out.println("index of first repetiting element " + i);
		}
	
	public static int finding(int a[], int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					return i;
				}
			}
		}
		return -1;
		
	}
}
