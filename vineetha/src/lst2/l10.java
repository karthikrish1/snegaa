package lst2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class l10 {

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
		List[] r = splitting(l);
		System.out.println(r[0]);
		System.out.println(r[1]);
	}
	public static List[] splitting(List<Character>l)
	{
		//identifying mid index'
		
		// size/2-> odd -1
		// size/2 -> even-0
		//size-> 11
		// 11/2-1
		//5-1=4
		int midindex=(l.size()/2)-(((l.size()%2)>0 ? 0:1));
	List<List<Character>> result = new ArrayList<>(l.stream().collect(Collectors.partitioningBy(s-> l.indexOf(s)>midindex)).values());
	return new List[] {result.get(0),result.get(1)};
	}
}
