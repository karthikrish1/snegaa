package randomqueries;

public class p3 {
	
	//roman number-> value
	
	/*SYMBOL       VALUE
	  I            1
	  IV           4
	  V            5
	  IX           9
	  X            10
	  XL           40
	  L            50
	  XC           90
	  C            100
	  CD           400
	  D            500
	  CM           900 
	  M            1000*/
	public static void main(String[] args) {
		
		p3 ob= new p3();
		String s="MM";
		System.out.println(ob.conversion(s));
	}
	public int value(char c)
	{
		//assigning values for roman letter
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;
		if(c=='C')
			return 100;
		if(c=='D')
			return 500;
		if(c=='M')
			return 1000;
		return -1;
	}
	
	public int conversion(String s)// return us the value of the symbol
	{
		int result=0;
		
		for(int i=0;i<s.length();i++)   //IV
		{
			int s1=value(s.charAt(i)); // fetching the value of each character  s[i] 
			
			if(i+1<s.length()) 
			{
				int s2=value(s.charAt(i+1));//fetching value of s[i+1]
			if(s1>=s2)//checking values of first and second /comparision 
			{
				result=result+s1;
			}
			
			else
			{
				result=result+s2-s1;
				i++;
			}
			}
			
			else
			{
				result=result+s1;
			}
		}
		return result;
	}



}
