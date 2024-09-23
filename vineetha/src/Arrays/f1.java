package Arrays;

public class f1 {

	public static void main(String[] args) {
		
		//row 0:  3 columns
		//row1:   2 columns
		
		int a[][]= new int[2][];
		a[0]=new int[3];
		a[1]= new int[2];
		
		int count=0;
		
		//assigning value to each element 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=count+=2;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
		
			{
				System.out.print(a[i][j]+ " ");
				
			}
			System.out.println();
			}
		
		//3 5 7
		//9 11
		
	}
	
}
