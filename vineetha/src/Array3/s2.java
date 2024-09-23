package Array3;

import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=0;
		if(s.hasNextInt())//if size mentioned by the user is greater than 1
		{
			row=s.nextInt();
		}
		
		System.out.println("Enter number of columns");
		int col=0;
		if(s.hasNextInt())//if size mentioned by the user is greater than 1
		{
			col=s.nextInt();
		}
		
		int a[][]= new int[row][col];
		System.out.println("Enter the elements of array:  ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Elements are");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
