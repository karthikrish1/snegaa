package array8;

public class n1 {
public static void main(String[] args) {
	
	int a[][]= { {1, 2,3},
			{4,5,6},
			{7,9,10}};
	
	/*
	 *         col0       col1       col2
	 * row 0     1         2          3
	 * row 1     4         5          6
	 * row 2     7         9          10
	 * 
	 * 
	 * */
	
	for(int i=0;i<a.length;i++)            //iterating through the rows
	{
		for(int j=0;j<a[i].length;j++)     //iterate thorugh the column(row size)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	swapping(a);
	System.out.println("after swapping");
	
	for(int i=0;i<a.length;i++)            //iterating through the rows
	{
		for(int j=0;j<a[i].length;j++)     //iterate thorugh the column(row size)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	
	
}

public static void swapping(int a[][])
{
	
	
	int l=a.length;
	for(int i=0;i<a[0].length;i++)
	{
		int temp=a[0][i];      // temp variable: assigning row 0
		a[0][i]=a[l-1][i];     // row 0   = last row
		a[l-1][i]=temp;        // last row= row 0
	}
	}
}
