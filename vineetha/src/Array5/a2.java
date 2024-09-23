package Array5;

public class a2 {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,5};
		int n=a.length;
		int low=1;
		int high=7;
		missing(a,n,low,high);
		
	}
	
	public static void missing(int a[] ,int n, int low, int high)
	{
		
		for(int i=low;i<=high;i++)//1 to 10
		{
			boolean result=false;
			
			for(int j=0;j<n;j++)   
			{
				if(a[j]==i)
				{
					result=true;
					break;
					
				}
			}
			if(!result)
			{
				System.out.println(i);
			}
		}
	}
}
