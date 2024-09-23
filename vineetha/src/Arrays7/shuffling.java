package Arrays7;

import java.util.Arrays;
import java.util.Random;

public class shuffling {
	public static void main(String[] args) {
		
		int a[]= {6,8,9,10};
		System.out.println(Arrays.toString(a));
		
		Random r= new Random();
		for(int i=0;i<a.length;i++)
		{
		int result=	r.nextInt(a.length); //4   //0,1,2,3
		int temp=a[result];
		a[result]=a[i];
		a[i]=temp;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
