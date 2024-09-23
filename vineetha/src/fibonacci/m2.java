package fibonacci;

public class m2 {

	public static void main(String[] args) {
		
		//3^2+ 2^2+1
		//9+4+1
		
		int prod=1;
		for(int i=1;i<=3;i++)
		{
			prod=prod*(i*i);
		}
		System.out.println(prod);
		
	}
}

/*sum=0
 *n=3
 *
 *firs iteration   i=1    i<=3      => sum=sum+(i*i)   ; sum=0+ 1   sum=1
 *second iteation i=2     2<=3     => sum=1+(2*2)      ; sum=1+4    sum=5
 *thier iteratio  i=3     3<=3      => sum=5+ (3*3)    ; sum=5+9    sum=14
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
