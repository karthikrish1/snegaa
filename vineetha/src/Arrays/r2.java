package Arrays;

public class r2 {

	//removing an element : use iteration
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length-1];
		//int index1;
		int ele=2;
		for(int index=0,index1=0;index<a.length;index++)
		{
			if(index!=ele)
			{
				b[index1]=a[index];
				index1++;
			}
		}
		
		for(int x:b)
		{
			System.out.println(x);
		}
		System.out.println();

	}

}
