package Arrays7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//even elements at odd index
public class a4 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size :");
		int size=Integer.parseInt(br.readLine());
		int a[]= new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println(Arrays.toString(a));
		printing(a,size);
	}
	
	public static void printing(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			// index       element
			if(i%2!=0 && a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		//odd index=> odd element
		//even index=> odd elements
		
		
		// even index=> even element
		// odd index=> even element 
	}
}
