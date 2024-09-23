package Arrays;

import java.util.Arrays;

public class re3 {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		int n=a.length;
		int temp[]= new int[n];
		for(int i=0;i<a.length;i++)
		{
			int lp=1;
			int rp=1;
			int i1=0;
			if(i1<i)
			{
				for(i1=0;i1<i;i1++)
				{
					lp*=a[i1];
				}
			}
			for( i1=i+1;i1<a.length;i1++)
			{
				rp*=a[i1];
			}
			
			int sum=lp*rp;
			temp[i]=sum;
			
		}
		a=temp;
		System.out.println(Arrays.toString(a));
	}
	
	/*lp=1   rp=1   i1=0
	 * 
	 * i=0    i<5   
	 *       i1<i  0<0
	 *       
	 *        i1=1; 1<5
	 *           rp=2*3*4*5
	 *           
	 *         int sum=120
	 *         temp[i]=  temp[0]=120
	 *         
	 *         
	 * 
	 *           
	 * i=1    i<5
	 *         i1<i
	 *         0<1    : for( int i1=pi1<i)
	 *                       lp*=a[i1]
	 *                       lp=a[0] 
	 *                       lp=1
	 *                       
	 *           i1=2   2<5
	 *                rp=3*4*5   
	 *                rp=60
	 *                
	 *            sum=1*60
	 *            
	 *        temp[1]=60
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
	 * 
	 * 
	 * 
	 * 
	 * */
}
