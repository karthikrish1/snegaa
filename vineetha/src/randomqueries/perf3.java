package randomqueries;

import java.util.Scanner;

public class perf3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=s.nextInt();
			
	   boolean result=checking(number);
	   if(result)
	   {
		   System.out.println("perfect square ");
	   }
	   
	   else
	   {
		   System.out.println("not a perfect ");
	   }
	   
	}
	public static boolean checking(int n)
	{
		double n1 = Math.sqrt(n);    //121         n1=11.0
		//(desired datatype) variablename 
		
		if(n1==(int)n1)       // 11.0==11    0.0  => 0 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
