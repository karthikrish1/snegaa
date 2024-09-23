package builtinclasses;

import java.util.Scanner;

public class s11 {
	public static void main(String[] args) {
		
		/*scanner: get input from the user at run time
		 * nonstatic in nature
		 * 
		 * strin: nextLine()
		 * int  : nextInt()
		 * float : nextFloat()
		 * double: nextDouble()
		 ** 
		 * */
		//classname objectname= new classname();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur name : ");
		String name=s.nextLine();
		System.out.println("Enter ur age :");
		int age=s.nextInt();
		System.out.println("Enter ur salary :");
		double sal = s.nextDouble();
		System.out.println("details are : ");
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("salary is "+ sal);
		
		
		
	}

}
