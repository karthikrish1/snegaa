package array8;

public class reversing {
	
	static int m=3;
	static int n=3;
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
	
	re(a);
	System.out.println("after reversing : ");
	for(int i=0;i<a.length;i++)            //iterating through the rows
	{
		for(int j=0;j<a[i].length;j++)     //iterate thorugh the column(row size)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	
	
	
}

public static void re(int a[][])
{
	//iterating through the rows
	for(int i=0;i<m;i++)
	{
		int start=0;
		int end=n-1;
		
		while(start<end)
		{
			int temp=a[i][start];
			a[i][start]=a[i][end];
			a[i][end]=temp;
			
			start++;
			end--;
		}
		
		/*
		 * 
		 * i=0   i<3
		 * start=0    end=2
		 * 
		 *  
		 * while   i=0
		 *        0<2
		 *            temp=a[i][0];   temp=1
		 *            a[0][0]= a[0][2]   a[0][0]=3
		 *            a[0][2]=1                  a[0][0]= 3   a[0][1]=2  a[0][2]=1
		 *            
		 *            start=1
		 *            end=1
		 *   
		 *        start=1  end=1
		 *        1<1
		 *            
		 *        
		 * 
		 *            
		 *    i=1
		 *        while  start= 0    end=2
		 *        temp=a[1][0]=> 4
		 *        a[1][0]=a[1][2]=> 6
		 *        a[1][2]=4               a[1][0]=6     a[1][1]=5    a[1][2]=> 4
		 *            
		 * 
		 * 
		 * i=2
		 *       temp=a[2][0]=> 7
		 *       a[2][0]=a[2][2]=> 10
		 *       a[2][2]=temp=>          a[2][0]=10   a[2][1]=9  a[2][2]=7
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		//1,2, 3    => 3,2,1 
	}
	}
}
