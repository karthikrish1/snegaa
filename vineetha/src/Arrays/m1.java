package Arrays;

//multiplying arrays 
public class m1 {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4};
		double b[]= {2.3,0.1,4.5,8.2};
		
		for(int index=0;index<a.length;index++)
		{
			 b[index]=b[index]*a[index];
		}
		
		for(double x:b)
		{
			System.out.println(x);
		}
	}
}
