package array4;

public class a1 {
//sum=6    => hw msny pairs
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,3};
		int sum=6;
		a1.s(a, sum);
		
	}
	
	public static void s(int a[], int sum)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+ a[j])==sum)
				{
					c++;
				}
			}
		}
		System.out.println("Number of pairs with sum 6 is "+ c);
	}
}
