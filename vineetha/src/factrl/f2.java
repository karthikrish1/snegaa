package factrl;

public class f2 {
public static void main(String[] args) {
	
	//int n=4;
	System.out.println(f2.fact(4));// providing value for n
}

public static int fact(int n)
{
	if (n==0)
	{
		return 1;
	}
	else
	{
		return n*fact(n-1); // internal loopin   
	}
		
	}
}

/*n=4          4* fact(4-1)    4*fact3
 * 
 * n=3         4* 3*fact(3-1)     4* 3* fact 2
 *            
 * n=2          4*3* 2* fact(2-1)  4*3*2* fact1
 *  
 *  n=1         4*3*2*1*fact0           4*3*2*1*1
 *  
 *  n=0         4*3*2*1*1*fact-1
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
