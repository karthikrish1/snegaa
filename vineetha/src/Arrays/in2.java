package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class in2 {
/*int => Integer
 *String-> String
 *double=> Double 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a[]= {10,11,12,13,14};
System.out.println(Arrays.toString(a));
int position=3;
int x=200;
insertion(a,x,position);
	}

	public static void insertion(Integer arr[], int x, int position)
	{
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		 list.add(position-1, x);
		// System.out.println(list);
		 Integer[] c = list.toArray(arr);
         
		System.out.println(Arrays.toString(c));
	}

}
