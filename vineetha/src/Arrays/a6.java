package Arrays;

//pass array as parameter 
public class a6 {

	public static void main(String[] args) {
		int b[]= {23,5,6,7};
		a6.small(b);
		
		
	}
	
	public static void small(int a[])
	{
		int s=a[0];
		for (int i=0;i<a.length;i++)
		{
			
			if(a[i]<s)
			{
				s=a[i];
			}
			
		}
		System.out.println("smallest number is "+ s);
	}
}
