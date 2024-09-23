package array8;

public class any2rows {
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
	int b=2;
	int c=3;
	swapping(a,b,c);
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

public static void swapping(int a[][], int b , int c)
{
	
int[] temp = a[b-1];
a[b-1]=a[c-1];
a[c-1]=temp;
}

}
