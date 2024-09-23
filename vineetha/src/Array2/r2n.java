package Array2;

import java.util.Arrays;

public class r2n {
	public static void main(String[] args) {
		
		int a[]= {0,4,5,-6,-7,20,-45};
		System.out.println(Arrays.toString(a));
		int position=0;
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>=0)//updating the array with positive value
			{
				a[position]=a[i];
				position++;
			}
			
		}
		
		for(int i=0;i<position;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
