package Array2;

import java.util.Arrays;

public class f2 {
	//finding the elements that are divisible by k
	
	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6,7,9};
	System.out.println(Arrays.toString(a));
	int n=a.length;
	int k=3;
	int s[]= new int[1];
	calculation(a,k,n-1,s);
	// addition=> s[0]
	System.out.println("Addition of elements that are divisible by 3 is "+s[0]);
	
	}

	public static void calculation(int a[], int k, int i, int answer[])
	{
		if(i<0)
		{
			return ;
		}
		
		if(a[i]%k==0)
		{
			answer[0]+=a[i];
		}
		calculation(a,k,i-1,answer);  // recusrion
	}
	
	/*n=7   k=3   a={1,3,4,5,6,7,9}
	 * i=n-1 =6
	 * i=6=> return
	 * 
	 * i=6
	 *  a[6]%3==0      answer[0]=9 
	 * i=5
	 *   a[5]%3==0
	 *   
	 * i=4
	 *   a[4]%3==0   answer=9+6 => 15  
	 * 
	 * i=3
	 *   
	 * i=2
	 * 
	 * i=1 
	 *     answer[0]=15+3=> 18
	 *     
	 *i=0
	 *     
	 *     
	 * i=-1 
	 *    if i<0     -1<0// stopped 
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
