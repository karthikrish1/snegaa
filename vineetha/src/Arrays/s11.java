package Arrays;

//reversing 
public class s11 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		s11.reversing(a);
	}
	
	public static void reversing(int []a)
	{
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[a.length-i-1];
		}
		
		/*b.length=4
		 * 
		 * i=0            b[0]= a[4-0-1]= a[3]    4
		 * i=1            b[1]=a[4-1-1] = a[2]    3
		 * i=2            b[2]=a[4-2-1]= a[1]     2
		 * i-3            b[3]=a[4-3-1]=1[0]=     1
		 * i=4   4<4// stop the iteration 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		//displaying
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
