package Array2;

import java.util.Arrays;

public class f1 {
	
	//a={5,6,8,9}
	//3-> 6+9=15
	
	public static void main(String[] args) {
		int a[]= {1,2,3,9,8,6};
		int k=3;
		int n=a.length;
		System.out.println(Arrays.toString(a));
		f1 ob= new f1();
		System.out.println(ob.s(a, k, n));
	}
	
	public int s(int a[], int k, int n)
	{
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%k==0)// each element is divisible by k
			{
				sum+=a[i];
			}
		}
		return sum;
	}

	
	// 1...10
	//product of all the numbers that are not divisble by 3
}
