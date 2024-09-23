package Array5;

import java.util.Arrays;

public class a1 {

	// findin missing number 
	
	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,12};  //16   => 21      
		int n=5;
		System.out.println(Arrays.toString(a));
		
		// total sum-sum of the elements => missing element
		System.out.println("Missing number is "+misssing(a,n));
	}
	
	//sum of n natural numbers   (n+1)*(n+2)/2
	
	// sum of n even numbers   n*(n+1)
	
	// sum of n odd numbers     n^2
	
	public  static int misssing (int a[], int n)
	
	//sum of n numbers (n+1)*(n+2)/2
	{
		int r=n*(n+1);   /// 2,4,6,8,10   => 30
		System.out.println(r);
		
		
		for(int i=0;i<n-1;i++)    
		{
			r-=a[i] ;  
		}
		return r;
		
	}
}
