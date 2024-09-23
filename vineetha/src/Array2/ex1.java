package Array2;

import java.util.Arrays;

public class ex1 {
	public static void main(String[] args) {
		
		// find product of elements present in even index
		// find product of elements present in odd position
		
		int a[]= {10,3,4,5,6};
		int n=a.length;
		System.out.println(Arrays.toString(a));
		finiding(a,n);
	}
	
	public static void finiding(int a[], int n)
	{
		int even=1;
		int odd=1;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				even*=a[i];
			}
			else
			{
				odd*=a[i];
			}
		}
		
		System.out.println("product of elements at even position is "+ even);
		System.out.println("Product of elements at odd position is "+ odd);
	}
	
	//sum of elements present at position 0,3,6,9
	//product of elements present at position 1,5

}
