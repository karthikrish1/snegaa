package randomqueries;

public class p5 {

	//abcd=> +1 ->  bcde
	
	// lexicographically next element
	
	// vinitha -> vinithb
	// vinithz -> vinitiz
	
	public static void main(String[] args) {
		
		String n="zzz";
		p5 ob= new p5();
		System.out.println(ob.change(n));
	}
	
	public String change(String n)
	{
		if(n==" ")
			return "a";
		
		int i=n.length()-1;
		
	   while(n.charAt(i)=='z' && i>=0)
	   
			i--;
		   // System.out.println(i);
	   
		if (i==-1)
		{
			n=n+'a';
		}
		
		else
		{
			// 65   b=66
			n = n.substring(0, i) + 
			         (char)((int)(n.charAt(i)) + 1) + 
			                      n.substring(i + 1);

		}
	   
		return n;
		
	}
}
