package Array3;

import java.util.Arrays;
import java.util.Scanner;

public class s1 {
public static void main(String[] args) {
	
	/*scanner: get input from the user at run time
	 * nonstatic
	 * int  : nexint[]
	 * string: nextLine
	 * hANWZR 
	 * 
	 * 
	 * 
	 * */
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=0;
	if(s.hasNextInt())//if size mentioned by the user is greater than 1
	{
		size=s.nextInt();
	}
	
	//initialisation of array
	int a[]= new int[size];
	System.out.println("Enter the elements: ");
	for(int i=0;i<size;i++)
	{
		if(s.hasNextInt())//if size mentioned by the user is greater than 1
		{
			a[i]=s.nextInt();// storing 
		}
		
	}
	
	// enhanced for 
	// for
	//
	System.out.println(Arrays.toString(a));
	
}
}
