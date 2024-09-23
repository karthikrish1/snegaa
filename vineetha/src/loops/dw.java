package loops;

public class dw {
	public static void main(String[] args) {
		
		/*
		 * for/while/do while
		 * 
		 * initialisation:  where to start
		 * condition     :  where to stop
		 *                forward: <=end value
		 *                backward: >=end value
		 *                
		 *inc/dec         :  diff between 2 conseuctive numbers 
		 *
		 *while: only if condition is true , statement will be executed
		 *do while: even if condition is false, one time execution will be there
		 *
		 *
		 *
		 *initialisation
		 *do
		 *{
		 *statmeent
		 *inc/dec
		 *}
		 *while(condition);
		 */
		
		int i=100;
		do
		{
			System.out.println(i);
			i=i+2;
		}
		while(i<=200);
		
		
		//odd numbers from 13 to 1
		
		int a=13;
		do
		{
			System.out.println(a);
			a=a-2;
		}while(a>=1);
	}

}
