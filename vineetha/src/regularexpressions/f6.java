package regularexpressions;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class f6 {
	// find duplicate 
	public static void main(String[] args) {
		
		String n="Hi vinitha Hi How are you";
		//splitted thewords=> stored in string array
		String[] words = n.split("\\W");
	    for(String x:words)
	    {
	    	System.out.println(x);
	    }
	   //each word will be stored in string array//create a map 
	    // string, occurance
	    Map<String,Integer>m= new HashMap<>();
	    //iterating through the words in that array
	    for(String x:words)
	    {
	    	if(m.get(x)!=null)
	    	{
	    		m.put(x, m.get(x)+1);  //word, occurance 
	    	}
	    	
	    	else
	    	{
	    		m.put(x, 1); 
	    	}
	    }
	    
	 //keyset:  contain only keys : unique keys (without duplicates )  
	   Set<String> s = m.keySet();
	   System.out.println(s);//iterating through the keyset 
	   for(String y:s)
	   {
		   // key will be compared iwth key in map and its occurance will be obtained and we will check for more occurance 
		   if(m.get(y)>1)// filtering the elements which is having more occurance 
		   {
			   System.out.println(y);
		   }
	   }
	    
	}

}
