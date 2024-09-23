package ranomd2;

import java.util.Stack;

public class d3 {
public static void main(String[] args) {
	
	int a[]= {12,3,4,10,0,9};
	int n=a.length;
	d3 ob= new d3();
	ob.s(a, n);
}
public void s(int a[], int n)
{
	Stack<Integer>s= new Stack();
	s.push(a[n-1]);   // adding the last element of array to stack //leader element 
	for(int i=n-2;i>=0;i--)
	{
		if(a[i]>=s.peek())
		{
			s.push(a[i]);
			
		}
	}
	while(!s.isEmpty())
	{
		System.out.println(s.pop());
	}
	}
}




