package array8;

public class n2 {
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
			for(int i=0;i<3;i++)
			{
				int temp=a[i][0];      // temp variable: assigning col 0
				a[i][0]=a[i][l-1];     // col 0   = last col
				a[i][l-1]=temp;        // last col= col 0
			}
		
		}
		
		
}
