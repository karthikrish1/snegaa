package Array2;

import java.util.Arrays;

public class ex2 {
	//finding sum of all the elements in an array using recursion
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int n=a.length;
		System.out.println(Arrays.toString(a));
		ex2 ob= new ex2();
		
		System.out.println(ob.sum(a, n));
	}
	
	public int sum(int a[], int n)
	{
		if(n<=0)
		{
			return 0;
		}
		else
		{
			return(sum(a,n-1)+ a[n-1]);
		}
	}
/*
 * 
 * n=5
 *    sum(a,5)+ a[5]    5
 *   
 * n=4
 *   sum(a,3) + a[4]  5+4  => 9
 *   
 * n=3
 *    sum(a,2)+ a[3]  3+9 => 12
 *    
 *   
 *n=2
 *   sum(a,1)+a[2]   12+2=> 14
 *   
 * n=1
 *   sum(a,0)+a[1]   1+14=15
 *   
 * n=0=> return 0 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
}
