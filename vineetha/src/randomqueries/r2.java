package randomqueries;

import java.util.HashSet;

public class r2 {

	public static void main(String[] args) {
		u1 ob= new u1();
		System.out.println(ob.checking("vintha"));
	}
	
public boolean checking(String n)
	{
	
		for(int i=0;i<n.length();i++)
		{
			char c = n.charAt(i);
			if(n.indexOf(c)!=n.lastIndexOf(c))
			{
				//index of first i  != index of last i 
				//1!=3
				
				// 1!=1
				return false;
			}
		  
}
		return true;
	}
}
