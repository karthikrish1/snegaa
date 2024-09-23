package Arrays7;

import java.util.Arrays;

public class a5 {
public static void main(String[] args) {
	
	//maximum even sum of pair 
	
	// minimum odd sum of pair
	//[2,3,4,5]
	//5,6,7,7,8,9
	// maximum-> 8
	int a[]= {2,3,4,5};
	int n=a.length;
	System.out.println(Arrays.toString(a));
	a5 ob= new a5();
	System.out.println(ob.max1(a, n));
	}
public int max1(int a[], int n)
{
	int r=0;
	
	for(int i=0;i<(n-1);i++)
	{
		for(int j=i+1;j<n;j++)
		{
			int sum=a[i]+a[j];  // addition
			if(sum%2==0)// addition is even
			{
			 r=max(r,sum);// max=> give us the biggest one 
			}
		}}
	return r;
	}

public static int max(int a, int b)
{
	if(a>b)
		{
		return a;
		}
	else
		{
		return b;
		}}
}
