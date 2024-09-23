package array4;

import java.util.Arrays;

public class a2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,0,2,3,0,5};
		int n=a.length;
		System.out.println(Arrays.toString(a));
		a2 ob= new a2();
		ob.moving(a, n);
	}
public void moving(int a[], int n)
	{
		int count=0;   // count of non zero elements
		for(int i=0;i<n;i++)   // from beggining index=> nonzero elements 
		{
			if(a[i]!=0)// nonzerto element
			{
				a[count++]=a[i];     // a[0]=1   //a[1]=2   a[2]=3  a[3]=2  a[4]=3  a[5]=5  
			}
			}
		
		//0  n=8    count=6   count7      
		while(count <n)  // filling remaining place with 0
		{
			a[count++]=0;   //from count to end 
		}
		
		System.out.println(Arrays.toString(a));
	}
}
