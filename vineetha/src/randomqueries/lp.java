package randomqueries;

import java.util.Scanner;

public class lp {
	
	/*
	 * 
	 * century year : 00  : leap year only if it is divible by 400    or  both 4 and 100 
	 * noncentury year : divisible by 4
	 * 
	* 
	 * */
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		
		if((year%40==0)||((year%4==0)&&(year%100==0)))
		{
			System.out.println("leap");
		}
		else
		{
			System.out.println("not a leap");
		}
	}

}
