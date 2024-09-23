package Arrays;

public class hu {
	public static void main(String[] args) {
		
		int a[][]= {{1,9},{8,6},{4,0}};
	  
		// add the eelements
		
	for(int row=0;row<a.length;row++)
	{
		int fn=0;
		
		for(int col=0;col<a[row].length;col++)
		{
			fn=fn+a[row][col];
		}
		System.out.println(fn);
	}
	
	System.out.println("column wise adding");
	   
	for(int i=0;i<a[0].length;i++)
	{
		int fn1=0;
		for(int j=0;j<a.length;j++)
		{
			fn1=fn1+a[j][i];
		}
		System.out.println(fn1);
	}
		
	}

}
