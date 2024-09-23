package Arrays;
//method3: using recursion
public class l3 {

	public static void main(String[] args) {
		
		int a[]= {3,4,5,6,0,90};
		System.out.println(l3.findin(a, 50));
	}
	
	public static int ind(int a[], int ele, int start)
	{
		if(start==a.length)
		     return -1;
		
		if (a[start]==ele)
		  return start;
		
		return ind(a,ele,start+1);
		
		
		
		
	}
	
	public static int findin(int a[], int ele)
	{
		return ind(a,ele,0);  
	}
	
	/*
	 * a={3,4,5,6,0,90}
	 * ele=5
	 *  start=0
	 *       if start=a.length
	 *       
	 *       if a[0]==5
	 *       
	 *   start=1
	 *        if 1=6
	 *         
	 *         ifa[1]==5
	 *         
	 *   start=2
	 *        2==6
	 *        
	 *        ifa[2]==5
	 *        return start 
	 *        
	 *        2
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
