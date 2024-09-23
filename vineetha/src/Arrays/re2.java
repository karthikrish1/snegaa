package Arrays;

import java.util.Arrays;

public class re2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};    //   {2*3*4*5, 3*4*5*1  ,4*5*1*2 ,}
		
		System.out.println(Arrays.toString(a));
		int n=a.length;
		int produc=1;
		for(int i=0;i<n;i++)
		{
			produc*=a[i];   
		}
		
		//element 
		for(int x:a)
		{
			System.out.println(x);
		}
		
		//prod/element
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=produc/a[i];
		}
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}
	

}
