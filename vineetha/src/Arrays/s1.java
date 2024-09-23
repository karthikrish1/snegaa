package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,9,8,7};
		int n=a.length;
		System.out.println(Arrays.toString(a));
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the posistion");
		int pos = s.nextInt();
		if(pos >0 && pos<n)
		{
			int b[]= new int[pos];
			int c[]= new int[n-pos];
			for(int i=0; i<pos;i++)
			{
				b[i]=a[i];  //i<3
				/*a[0]    10
				 * a[1]   20
				 * a[2]   30
				 * 
		 * 
				 * */}
			
			for(int i=0; i<n-pos;i++)//i<4  
			{
				c[i]=a[i+pos];
				//   3+0     a[3]   => 40
				//   3+1     a[4]   => 9
				//   3+2     a[5]   => 8
				//   3+3     a[6]    => 7
			}
			
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(c));
		}
		
	}

}
