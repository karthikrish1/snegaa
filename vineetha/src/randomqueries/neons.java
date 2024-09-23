package randomqueries;

import java.util.Scanner;

public class neons {
	
	//   => % => remainder
	//  => / => quotient 

	
	// neon number
	
	// square of the number=> sum of that => original number
	
	//9  : 9*9 =.> 81      => 8+1=> 9
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=s.nextInt();
		System.out.println(neons.checking(n));
	}
	
	public static boolean checking(int n)
	{
		int square=n*n;
		
		int sum=0;
		
		while(square>0)
		{
			int rem=square%10;
			
			sum+=rem;
			
			square=square/10;
		}
		
		
		if(sum==n)
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
}

/*int n=9 
 *int square=81
 *    step1:   81%10 => rem=1
 *    step2:   sum+=rem   sum=sum+rem    sum=0+1=1
 *    step3:   square=square/10    square=81/10  => 8
 *    
 *    8>0
 *    step1:  8%10 => 8
 *    step2:   sum+=rem  sum=sum+rem    sum=1+8=9
 *    step3:   8/10   => 0.8  square=0.8
 *    
 *    0.8>0
 *      9==9 => neon
 *      
 * int n=8
 *  int square=64
 *       step1:   64%10    => 4
 *       step2:    sum=4
 *       step3: 64/10    => 6
 *       
 *       6>0
 *         step1: 6%10   => 6
 *         step2:  sum=10
 *         step3: 6/10  = 0.6
 *         
 *         sum==n
 *         10==8// wrong
 * 
 * 
 * 
 * */
