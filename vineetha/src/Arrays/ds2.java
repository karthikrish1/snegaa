package Arrays;

import java.util.Arrays;

public class ds2 {
	public static void main(String[] args) {
		
		int a[]= {9,2,3,3,4,5,6,6,9};
		System.out.println(Arrays.toString(a));
		int n=a.length;
		fil(a,n);
	}
	
	public static void fil(int a[], int n)
	{
		Arrays.sort(a);//sorting 
		
		for(int i=0;i<n;i++)
		{
			while(i<n-1 && a[i]==a[i+1])// checking index 
				i++;
			
			// if duplicate is identified moving ahead to the next element
			
			System.out.println(a[i]);
		}
		
	}

	
	/*a={9,2,3,3,4,5,6,6,9};
	 * 
	 * a={2,3,3,4,5,6,6,9,9}
	 *    
	 *    i=0  n=9
	 *        0<8    a[0]==a[1]       print a[0]   =>2
	 *        
	 *    i=1  
	 *       1<8     a[1]==a[2]    i=2   print     => 3
	 *       
	 *    i=3
	 *       3<9     a[2]==q[3]    3==4            => 4
	 *       
	 *      
	 *    i=4  
	 *        4<9     a[4]==a[5]  5==6             =>  5
	 *        
	 *    i=5
	 *                a[5]==a[6]     i=6          =>   6
	 *                
	 *   i=7 
	 *               a[7]==a[8]    i=8            => 9
	 *               
	 *   i=9      9<9  
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
