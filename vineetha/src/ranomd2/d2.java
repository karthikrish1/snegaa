package ranomd2;

public class d2 {
	
	public static void main(String[] args) {
		
		//leader element 
		//[2,3,4,10,4,0,9]
		// elements which is greater than right most elements 
		//10 ,9
		int a[]= {12,3,4,10,0,9};
		int n=a.length;
		d2 ob= new d2();
		ob.printing(a, n);
	}
	public void printing(int a[], int n)
	{   int j;
		for(int i=0;i<n;i++)
		{
			for( j=i+1;j<n;j++)
			{
				if(a[i]<=a[j])
				{
					break;
				}
			}
			if(j==n)
			{
				System.out.println(a[i]);
			}
		}
	}
	
	// get number of number of occurance
	// get string 
	// 2=> string should be printed  

}
