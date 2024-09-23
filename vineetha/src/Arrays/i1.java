package Arrays;

import java.util.Arrays;

public class i1 {
public static void main(String[] args) {
	
	//find index of particular element
	int a[]= {2,3,4,5,6,89,90};
	System.out.println(i1.id(a, 0));
}

public static int id(int a[],int ele)
{
	
	int index = Arrays.binarySearch(a, ele);
	return (index<0)? -1: index;
	}
}
