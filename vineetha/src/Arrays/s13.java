package Arrays;

public class s13 {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		for(int index=0; index<a.length;index++)
		{
			a[index]=index*2;   // 0,5,10,15....50
		}
		
		for(int x:a)
		{
			System.out.println(x);
		}
	}
}
