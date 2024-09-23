package Arrays;

public class a3 {
	
	public static void main(String[] args) {
		
	
//slicing
	
	char[] letters= {'h','i','h','o','w','r'};
	
    for(char x:letters)
    {
    	System.out.println(x);
    }
    
    char[] result= new char[3];
    System.arraycopy(letters, 2, result, 0, 3);
    //                src, srcpost, dest, destpos, length) 
    for(char x:result)
    {
    	System.out.println(x);
    }
    
    //int      a[]={30,40,50,60,90}     => 40, 50
    //         b[]={"hi", "how", "hello", "vinitha"}
    
}
}