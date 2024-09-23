package Arrays;

import java.util.Arrays;

public class ds11 {
	public static void main(String[] args) {
		int a[]= {2,2,3,4,4,5,6,6};
		System.out.println(Arrays.toString(a));
		int n=a.length;
		filterin(a,n);
	}
	
	public static void filterin(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			int j;
			for( j=0;j<i;j++)
				if(a[i]==a[j])
					break;
		        if(i==j)
		        	System.out.println(a[i]);
		}
		
		
	}
	
	/*a={2,2,3,4,4,5,6,6}
	 * 
	 * n=8
	 * 
	 * i=0   i<8
	 *          j=0  j<0
	 *          j=1  j<0
	 * i=1   i<8
	 *         j=0    0<1
	 *             a[1]==a[0]
	 *             stop
	 *             if 1==0
	 *             
	 *i=2   2<8
	 *       j=0    0<2
	 *                a[2]==a[0]
	 *                
	 *                i==j
	 *i=3    3<8
	 *        j=0     0<3
	 *                a[3]==a[0]
	 *                4==2
	 *                
	 *       j=1     1<3
	 *              a[3]==a[1]
	 *              
	 *       j=2     2<3
	 *               a[3]==a[2]
	 *               
	 *i=4
	 *                
	 *             
	 *        
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
