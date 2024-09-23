package Arrays;

import java.util.Arrays;

public class d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {10,20,40,50};
		System.out.println(Arrays.toString(a));
		
		int index=1;
		 int[] c = d1.removal(a, index);
		 System.out.println(Arrays.toString(c));
	}
	
	public static int[] removal(int a[], int index)
	{
		if(a==null || index<0 ||index>=a.length)
		{
			return a;
		}
		
		int b[]= new int[a.length-1];
		for(int i=0,k=0;i<a.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			b[k++]=a[i];
		}
		return b;
	}

}
