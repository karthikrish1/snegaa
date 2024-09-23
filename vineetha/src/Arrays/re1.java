package Arrays;

import java.util.Arrays;

public class re1 {
public static void main(String[] args) {
	
	int a[]= {2,3,4,5};
	System.out.println(Arrays.toString(a));
	// replacing every element with element present after it
	int n=a.length;
	
	int tem = a[0];
	//iterate through the elements present 
	for(int i=0;i<a.length-1;i++)
	{
		a[i]=a[i+1];//replacing first element with next element 
	}
	
	//replace the last element with first element 
	a[n-1]=tem;
	System.out.println(Arrays.toString(a));
}


}
