package Array2;

import java.util.Arrays;

public class fe1 {
public static void main(String[] args) {
	
	// frequency of  elements in an array
	
	int a[]= {1,1,2,3,4,5,5,6,6,7,7,7,1};
	System.out.println(Arrays.toString(a));
	int n=a.length;
	find(a,n);
	
}

public static void find(int a[], int n)
{
	
	int fr=1;
	for(int i=1;i<n;i++)
	{
		if(a[i]==a[i-1])
		{
			fr++;
		}
		
		else
		{
			System.out.println("frequency of "+ a[i-1]+ "is "+ fr);
			fr=1;
		}
	}
	
	System.out.println("frequency of "+ a[n-1]+ "is "+ fr);
}
}

/*fr=1
 * i=1    a[1]=a[0]    fr=2    a[2]=a[1]  .....a[5][a4]     a[0]             
 * i=2    a[2]=a[1]     
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
