package lst2;

import java.util.ArrayList;
import java.util.List;

public class l7 {
public static void main(String[] args) {
	ArrayList<Integer>l= new ArrayList<>();
	l.add(90);
	l.add(20);
	l.add(10);
	l.add(50);
	System.out.println(l);
	List[] result = splitting(l);
	System.out.println(result[0]);
	System.out.println(result[1]);
}

public static List[] splitting(List<Integer>l)
{
int size=l.size();

ArrayList<Integer>first= new ArrayList<>(l.subList(0, size/2));

ArrayList<Integer>second= new ArrayList<>(l.subList(size/2, size));
return new List[] {first,second};
}
}
