package Arrays;

public class a7 {
	public static void main(String[] args) {
		
		//addition of all numbers in an array
		
		int a[]= {3,2,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum is "+ sum );
		
		// i=0     sum=sum+a[0]     0+3     sum=3
		// i=1     sum=sum+a[1]    3+2     sum=5
		// i=2     sum=sum+a[2]    5+4     sum=9
		// i=3     sum=sum+a[3]    9+5     sum=14
		// i=4     sum=sum+a[4]    14+6    sun=20
		// i=5   5<5  // loop terminates 
		
	}

}
