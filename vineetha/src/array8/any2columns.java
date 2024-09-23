package array8;

public class any2columns {
public static void main(String[] args) {
	
	int a[][]= { {1, 2,3},
			{4,5,6},
			{7,9,10}};
	
	for(int i=0;i<a.length;i++)            //iterating through the rows
	{
		for(int j=0;j<a[i].length;j++)     //iterate thorugh the column(row size)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	
	int b=1;
	int c=2;
	exchange(a,b,c);
	
	System.out.println("after interchange :");
	for(int i=0;i<a.length;i++)            //iterating through the rows
	{
		for(int j=0;j<a[i].length;j++)     //iterate thorugh the column(row size)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
}

public static void exchange(int a[][], int b, int c)
{
	
	for(int i=0;i<a.length;i++)
	{
		int temp=a[i][b-1];
		a[i][b-1]=a[i][c-1];
		a[i][c-1]=temp;
	}
	}
}
