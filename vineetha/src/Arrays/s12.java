package Arrays;

public class s12 {
public static void main(String[] args) {
	
	// number of occurance of particular element
	
	int a[]= {1,2,3,3,3,3,3,5,6,7,9};
	System.out.println("Number of occurance of element 3 is "+ s12.occurance(a, 3));
	
	
	// array: strin
	//nonstatic method 
}

public static int occurance(int []a, int element)
{
	int occ=0;
	for(int index=0;index<a.length;index++)
	{
		if(element==a[index])
		{
			occ++;
		}
	}
	
	return occ;
	}
}
