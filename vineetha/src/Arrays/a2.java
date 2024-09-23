package Arrays;

public class a2 {
public static void main(String[] args) {
	// datatype arrayname[]={value1,value2......}
	
	
	char letters[]= {'e','f','a','n','t','i','j'};
	
	//   index    0    1   2     3    4     5   

	//            e    f   a     n    t     i
	
	//System.out.println(letters[0]);
	// 0,2,4,6
	
	//letters[6]='j';
	
System.out.println("even positioned elements ");	
	for(int i=0;i<letters.length;i=i+2)
	{
		System.out.println(letters[i]);
	}
	

	System.out.println("odd positioned elements ");	
	for(int i=1;i<letters.length;i=i+2)
	{
		System.out.println(letters[i]);
	}	
	
	// reverse order :  from last 
	System.out.println("In reverse order");
	for(int i=letters.length-1;i>=0;i=i-1)
	{
		System.out.println(letters[i]);
	}
	
	//double array
	//0,3,6
	// reverse order 
	
}  
}
