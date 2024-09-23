package random11;

import java.util.Vector;

public class cw {
//remove consecutive same words
	
	public static void main(String[] args) {
		Vector<String>v= new Vector();
		v.add("apple");
		v.add("orange");
		v.add("orange");
		v.add("kiwi");
		System.out.println(v);
		System.out.println(after(v));
	}
	
	public static int after(Vector<String> v)
	{
		//vector
		int n=v.size();
		for(int i=0;i<n-1;i++)
		{
			if(v.get(i).equals(v.get(i+1)))
			{
				v.remove(i);
				v.remove(i);
			
			if(i>0)//upate i, size 
				{i--;
			    n=n-2;}
			   else
			    	{i++;}
			}
		}
		return v.size();
	}
}
