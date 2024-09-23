package array4;

import java.util.ArrayList;
import java.util.Arrays;

public class a3 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>l= new ArrayList<>(Arrays.asList(10,9,0,8,3,0,3,2));
		System.out.println(l);
		a3.movingg(l);
		

	}
	
	public static void movingg(ArrayList<Integer> l)
	{
		int count=0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==0)   /*iterae through the list, 0 comes=> increment count by 1=> remove , decrement                 */
			{
				count++;// 6
				l.remove(i);
				i--;
			}
		}
		
		for(int i=0;i<count;i++)
		{
			l.add(0);
		}
		
		System.out.println("displaying the list of elements ");
		
		for(int x:l)
		{
			System.out.println(x);
		}
	}
	
	

}
