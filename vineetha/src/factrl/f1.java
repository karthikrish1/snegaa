package factrl;

public class f1 {
public static void main(String[] args) {
	//factorial
	//4!=> 4*3*2*1
	
	int i=1;
	int fact=1;
	int n=4;
	for( i=1; i<=n;i++)
	{
		fact=fact*i;
	}
	
	System.out.println(fact);
}
}


/*
 * i=1    fact=1
 * 
 * first:    i=1  i<=4 
 *          fact=1*1     fact=1   i=2
 *          
 *           i=2  2<4
 *           fact=2
 *           
 *           i=3
 *           fact=2*3  =6
 *           
 *           i=4
 *           fact=> 6*4
 * 
 * 
 * 
 * */
 