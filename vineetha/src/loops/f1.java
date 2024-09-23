package loops;

public class f1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 *
		 *syntax: for(initialisation; condition checking; inc/dec)
		 *{
		 *statmeent
		 *}
		 *
		 */
		
		for(int i=3;i<=30;i=i+3)
		{
			System.out.println(i);
		}
		
		
		/*
		 * i=3   i<=30      print 3       i=i+3     i=6
		 * 
		 * i=6   i<=30     print 6                  i=9
		 * 
		 * 
		 * i=30  i<=30      print 30         i=33    
		 * 
		 * i=33  33<=30 // sto it 
		 * 
		 * 
	* 
		 * */
		
		//print my name 10 times
		
		for(int i=0;i<=9;i++)
		{
			System.out.println("hi vinitha");
		}
	}

}
