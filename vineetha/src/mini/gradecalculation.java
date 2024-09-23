package mini;

import java.util.Scanner;

public class gradecalculation {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of students : ");
	int number=s.nextInt();
	
	int[]studentmarks=new int[number];
	//iterating through it
	for(int i=0;i<number;i++)
	{
		System.out.println("Enter the marks for student "+(i+1)+ ":");
		studentmarks[i]=s.nextInt();
	}
	s.close();
		
	//for grade calucaltion
	
	// iterating through the marks of students
	for(int x:studentmarks)
	{
		char grade=calculate(x);
		System.out.println("students with marks "+ x+ " gets grade   "+ grade);
	}
	
}

public static char calculate(int mark)
{
	if(mark>=90)
	{
		return 'A';
	}
	else if(mark>=80)
	{
		return 'B';
	}
	else if(mark>=70)
	{
		return 'C';
	}
	
	else if(mark>=60)
	{
		return 'D';
	}
	
	else
	{
		return 'F';
	}
	


}
}
