package fibonacci;

public class f1 {

	public static void main(String[] args) {
		
		//0   1  1  2  3  5   8  13  21  34  
		
		int n1=0;
		int n2=1;
		int n3;
		int c=8;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<c;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}


/*0
 *1
 *1
 *2
 *3
 *5
 *8
 *13
 *
 *i=2     2<8     n3=n1+n2   n3=1     =>     print 1 ;   n1=1   n2=1   ; i=i+1
 *i=3     3<8     n3=n1+n2   n3=2     ->     print 2 ;   n1=1   n2=2   ;  i=i+1
 *i=4     4<8     n3=1+2     n3=3     ->     print 3 ;   n1=2   n2=3   ;  i=i+1
 *i=5     5<8     n3=2+3     n3=5     ->     print 5     n1=3   n2=5   ;  i=i+1
 *i=6     6<8     n3=5+3     n3=8            print 8      n1=5  n2=8   ; i=i+1
 *i=7     7<8     n3=5+8     n3=13           print 13     n1=8  n2=13  ; i=i+1
 *i=8     8<8  //stop the iteration
 *
  
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 