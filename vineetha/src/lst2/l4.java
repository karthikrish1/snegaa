package lst2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class l4 {
	static Random r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character>l= new ArrayList<>();
		l.add('x');
		l.add('a');
		l.add('j');
		l.add('c');
		l.add('f');
		l.add('k');
		l.add('z');
		System.out.println(l);
		int total=3;
		r= new Random();
		System.out.println(getting(l,total));
		
	}
	
	public static List<Character>getting(List<Character>l , int total)
	{
		ArrayList<Character>l1= new ArrayList<>();
		for(int i=0;i<total;i++)
		{
			int randomindex = r.nextInt(l.size());
			l1.add(l.get(randomindex));
		}
		return l1;
	}

}
