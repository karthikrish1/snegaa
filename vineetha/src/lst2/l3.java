package lst2;

import java.util.ArrayList;
import java.util.Random;

public class l3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character>l= new ArrayList<>();
		l.add('x');
		l.add('a');
		l.add('j');
		l.add('d');
		System.out.println(l);
		System.out.println(choosing(l));
	}

	public static char choosing(ArrayList<Character> l)
	{
		
	Random r= new Random();
	return l.get(r.nextInt(l.size()));
	}
}
