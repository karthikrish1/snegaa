package Array5;

import java.util.ArrayList;
import java.util.TreeSet;

public class unionn {

	public static void main(String[] args) {
		
		int a1[]= {2,3,4,9};
		int b1[]= {0,1,2,6,8};
		//  {0,1,2,3,4,6,8,9}
		
		int n=a1.length;
		int m=b1.length;
		
		System.out.println(union(a1,b1));
	}
	public static ArrayList union(int a1[], int b1[])
	{
		//removing duplicates
		TreeSet<Integer>s= new TreeSet<>();
		
		for(int x:a1)
		{
			s.add(x);
		}
		//adding first array element to the set
		
		
		for(int x:b1)
		{
			s.add(x);
		}
		//adding second arry element to the set 
		// duplicates are ignored
		
		// s=> a1 , b1
		
		//creatina a list  adding elements of set to list
		ArrayList<Integer>l= new ArrayList<>();
		for(int x:s)
		{
			l.add(x);
		}
		return l;
	}
}
