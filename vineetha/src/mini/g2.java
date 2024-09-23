package mini;

import java.util.Scanner;

public class g2 {

	/*  A      >=94
	 *  A-     >=90 and <94
	 *  B+      >=87   and <90
	 *  B       >=83   and <87
	 *  B-      >=80    and <83
	 *  C+       >=77   and <80
	 *  C        >=73   and <77
	 *  C-       >=70   and  <73
	 *  D+       >=67   and <70
	 *  D        >=63   and <67
	 *  D-       >=60   and <63
	 *  F        <60
	 * 
	 * * 
	 * */
	
	public static void main(String[] args) {
		
		double[] marks=new double[8];
		double sum=0;
		double avg = 0;
		int i;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the marks obtained in 8 subjects : ");
		for( i=0;i<8;i++)
		{
			marks[i]=s.nextDouble();
			}
		
		for( i=0;i<8;i++)
		{
			sum=sum+marks[i];
			avg=sum/8;
		}
		System.out.print("Grade = ");
		
		
		if(avg>=94)
		{
			System.out.println("A");
		}
		else if(avg>=90 && avg<94)
		{
			System.out.println("A-");
		}
		else if(avg>=87 && avg<90)
		{
			System.out.println("B+");
		}
		
		else if(avg>=83 && avg<87)
		{
			System.out.println("B");
		}
		
		else if(avg>=80 && avg<83)
		{
			System.out.println("B-");
		}
		
		else if(avg>=77 && avg<80)
		{
			System.out.println("C+");
		}
		
		else if(avg>=73 && avg<77)
		{
			System.out.println("C");
		}
		
		else if(avg>=70 && avg<73)
		{
			System.out.println("C-");
		}
		
		else if(avg>=67 && avg<70)
		{
			System.out.println("D+");
		}
		
		else if(avg>=63 && avg<67)
		{
			System.out.println("D");
		}
		
		else if(avg>=60 && avg<63)
		{
			System.out.println("D-");
		}
		
		else
		{
			System.out.println("F");
		}
		
	}
}
