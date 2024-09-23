package randomqueries;

import java.util.HashSet;

public class u1 {

	public static void main(String[] args) {
		
		u1 ob= new u1();
		System.out.println(ob.checking("vintha"));
	}
	
public boolean checking(String n)
	{
	//accept only unique value
		HashSet h= new HashSet();
		for(int i=0;i<n.length();i++)
		{
			char c = n.charAt(i);
		   if(!h.add(c))// f character is not added => not unique 
             {
			return false;
               }
		}
		return true;
}
}