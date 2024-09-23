package Arrays;

public class a10 {
	public static void main(String[] args) {
		
		int []a= {7,8,9,15,78,80,90};
		System.out.println("Even numbers are ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		// greater tha 10
		System.out.println("odd numbers are ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0 && a[i]>10)
			{
				System.out.println(a[i]);
			}
		}
		
		
		// divisible by 3 and less than 20
		// divisible by 5 and greater than 30
		
		
	}

}
