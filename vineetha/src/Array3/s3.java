package Array3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array :");
	
		
		int size = Integer.parseInt(br.readLine());
		int a[]= new int[size];
		System.out.println("Enter the elements : ");
		
		for(int i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Elements are : ");
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
