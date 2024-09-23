package fibonacci;

public class f2 {

	static int n1=0;
	static int n2=1;
	static int n3=0;
	public static void main(String[] args) {
		
		int c=8;
		System.out.println(n1);
		System.out.println(n2);
		fib(c-2);
	}
	
	
	public static void fib(int c)
	{
		if(c>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			fib(c-1);
		}
	}
}

/*0
 *1
 *1
 *2
 *3
 *5
 *
 *     fib     c=6  
 *             n3=n1+n2    =0+1   n3=1
 *             n1=1
 *             n2=1
 *               print 1
 *     fib       c=5
 *               n3=n1+n2     n3=1+1=2
 *               n1=1
 *               n2=2
 *               fib(c-1)
 *               
 *     fib       c=4
 *                n3=n1+n2    1+2   n3=3
 *                n1=2
 *                n2=3
 *                fib(c-1)
 *                
 *    fib        c=3
 *                 n3=n1+n2 
 *                 n3=2+3 =5
 *                 n1=3
 *                 n2=5
 *                c-1
 *   fib         c=2
 *                 n3=n1+n2=8
 *                 print 8
 *                 n1=5
 *                 n2=8
 *                 
 *  fib          c=1 
 *               n3=13
 *               n1=8
 *               n2=13
 *               c=0
 *                 
 *    
 *               
 *               
 * 
 * 
 * 
 * */
