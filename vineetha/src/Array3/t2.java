package Array3;

public class t2 {
	static int n=2;
	public static void main(String[] args) {
		
		int a[][]= {{10,20},
				{30,40}};
		t2.trans(a);
		
	}
	public static void trans(int a[][])
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		System.out.println("Elements are ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

/*  10   20
 *  30   40 
 * 
 * row 0      temp=a[0][0]  -> 10
 *            a[0][0]=a[0][0]
 *            a[0][0]=10                10
 *            
 *            temp=a[0][1]
 *            a[0][1]=a[1][0]=30
 *            a[0][1]=30                10   30       
 *            a[1][0]=temp
 *            
 * row 1        temp=a[1][0]-> 30
 *             a[1][0]=a[0][1]=20
 *             a[1][0]=20              20
 *             
 *             temp=a[1][1]
 *             a[1][1]=a[1][1]
 *             a[1][1]=40             20     40

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
