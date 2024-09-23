package Array3;

public class t1 {
	static int n=3;//3*3 matrix
	public static void main(String[] args) {
		
		int a[][]= { {1,2,3},
				{4,5, 6},
				{7,8,9}};
		
		int b[][]= new int[n][n];
		trn(a,b);
		}
	
	public static void trn(int a[][], int b[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		
		System.out.println("displaying ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
 * 0  0    b[0][0]=  a[0][0]  => 1
 *         b[0][1]=  a[1][0]  => 4
 *         b[0][2]=  a[2][0]  => 7     1   4    7
 *         
 * 
 * 1       b[1][0]= a[0][1]=2
 *         b[1][1] =a[1][2]=> 5
 *         b[1][2] =a[2][1]=  8        2    5    8
 *         
 *         
 * 2      b[2][0]=a[0][2]  => 3
 *        b[2][1]=a[1][2]  => 6
 *        b[2][2]=a[2][2]  => 9         3   6    9
  * 
 * 
 * 
 * */



