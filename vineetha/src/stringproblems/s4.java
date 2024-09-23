package stringproblems;

import java.util.Arrays;

public class s4 {
	
	//method4: swapping
	
	public static void main(String[] args) {
		String n="bye";
		char[] a = n.toCharArray();
		int left=0;
		int right=0;
		right=a.length-1;
		
		
		for(left=0;left<right;left++,right--)
		{
			char temp=a[left];
			a[left]=a[right];
			a[right]=temp;
		}
		
		System.out.println(Arrays.toString(a));
	}

	
	/*[b  y  e]
	 * 
	 *right=2
	 *
	 *    left=0    0<2     right=2
	 *          temp=a[0]
	 *          a[0]=a[2]
	 *          a[right]=temp
	 *          a[2]=a[0]                      b
	 *          
	 *          
	 *    left=1    1<2     right=1
	 *            temp=a[1]
	 *            a[1]=a[1]
	 *            a[1]=a[1] 
	 *            a[1]= y                 y  b 
	 *            
	 *                            
	 *      left=2       right=0
	 *           temp=a[2]
	 *           a[2]=a[0]
	 *           a[0]=a[2]                 e   y   b
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
}
