package lst2;

import java.util.ArrayList;
import java.util.List;

public class l6 {

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
		List[] result = splitting(l);
		System.out.println("first list "+ result[0]);
		System.out.println("second list "+ result[1]);
		
	}
	
	public static List[] splitting(List<Character>l)
	{
		ArrayList<Character>first= new ArrayList<>();
		ArrayList<Character>second= new ArrayList<>();
		
		int size=l.size();
		for(int i=0;i<size/2;i++)
		{
			first.add(l.get(i));
		}
		
		for(int i=size/2;i<size;i++)
		{
			second.add(l.get(i));
		}
		return new List[] {first,second};
	}
	

}
