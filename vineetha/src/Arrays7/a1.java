package Arrays7;
public class a1 {
public static void main(String[] args) {
		// monotonic -> increasing/decreasing 
		int a[]= {1,3,4,11,5};
		a1 ob= new a1();
		boolean result = ob.checking(a);
		if(result)
		{
			System.out.println("yes they are monotonic");
		}
		else
		{
			System.out.println("no they are not");
		}
		}
	
	public boolean checking(int a[])
	{
		int n=a.length;
		boolean inc=true;
		boolean dec=true;
		
		for(int i=0;i<n-1;i++)
		{
			if(a[i]> a[i+1])
			{
				inc=false;
			}
		}
		
		for(int i=0;i<n-1;i++)
		{
			if(a[i]< a[i+1])
			{
				dec=false;
			}
		}
		return inc|| dec;
	}
}
