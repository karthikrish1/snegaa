package Arrays;

public class a9 {

	public static void main(String[] args) {
		
		int a[]= {20,9,10,8};
		int temp=0;
		System.out.println("before sorting ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
