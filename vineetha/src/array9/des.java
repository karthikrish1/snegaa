package array9;

import java.util.Scanner;

public class des {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of elements : ");
	int n=s.nextInt();
	int a[]= new int[n];
	System.out.println("Enter the elements : ");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	
	System.out.println("elements are :");
	for(int x:a)
	{
		System.out.println(x);
	}
	
	//sorting the elements 
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
	}
	
	System.out.println("elements after sorting  are :");
	for(int x:a)
	{
		System.out.println(x);
	}
}

}
