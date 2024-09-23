
package array4;

public class scnlarg {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,40,90};
		int n=a.length;
		System.out.println(scnlarg.l1(a, n));
	}
	
	public static int l1(int a[], int n)
	{
		int first;
		int second;
		
		if(a[0]>a[1])
		{
			first=a[0];
			second=a[1];
		}
		else
		{
			first=a[1];
			second=a[0];
		}
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			
			else if(a[i]<first && a[i]>second)
			{
				second=a[i];
			}
		}
		return second;
	}
}


