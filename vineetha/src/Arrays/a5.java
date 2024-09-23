package Arrays;

public class a5 {

	public static void main(String[] args) {
		
		int a[]= {0,9,8,10,5,3};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i]> max)
			{
				max=a[i];
			}
		}
		System.out.println("biggest one is "+ max);
		
	}/*
	max=0
	
	first iteration  i=0   a[0]> max0   0> 0
	second iteration i=1   a[1]> max    9>0    => max=a[1]    max=9
	third iteartion i=2    a[2]> max    8>9
	fourth ieration i=3    a[3]> max    10>9    max=a[3]    max=10
	fifth iteration i=4    a[4]> max    5>10    
	sixth ieration  i=5    a[5]> max    3> 10
	seventh  iteration i=6   6<6//stop the iteration
	
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*/
}
