package loops;

public class wh1 {
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
		 *syntax:
		 *
		 * initialisaiton
		 * while(condition)
		 * {
		 * statement
		 * inc/dec
		 * }
		 * 
		 * odd numbers    1: 13      1,3,5,7,9,11,13
		 * 
		 * 0 to 20   even numbers 
		 * 
		 * 8th 80...0
	* */
		
		int i=1;
		while(i<=13)
		{
			System.out.println(i);
			i=i+2;
		}
		
		int a=80;
		while(a>=0)
		{
			System.out.println(a);
			a=a-8;
		}
		
		
		
	}

}
