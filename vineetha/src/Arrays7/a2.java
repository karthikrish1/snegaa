package Arrays7;

public class a2 {

	public static void main(String[] args) {
		int a[]= {20,9,8,3};
		boolean result = checking(a);
		if(result)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
	public static boolean checking(int a[])
	{
		int n=a.length;
		//checking descending order 
		if(isasded(a,n,true))
		{
			return true;
		}
		
		//checking ascending 
		if(isasded(a,n,false))
		{
			return true;
		}
		return false;
	}
	public static boolean isasded(int a[],int size, boolean result)
	{
		if(result)
		{
			for(int i=1;i<size;i++)
			{
				if(a[i]>a[i-1])
				{
					return false;
				}
			}
		}
		
		else
		{
			for(int i=1;i<size;i++)
			{
				if(a[i]<a[i-1])
				{
					return false;
				}
			}
		}
		return true;
	}
}
