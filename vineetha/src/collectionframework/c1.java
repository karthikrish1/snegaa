package collectionframework;

import java.util.PriorityQueue;

public class c1 {

	public static void main(String[] args) {
		// unordered 
PriorityQueue<Integer>t= new PriorityQueue<>();
t.add(90);
t.add(450);
t.add(10);
t.add(870);
t.add(9000);
System.out.println(t);

t.remove();
t.remove(9000);
System.out.println(t);

System.out.println(t.peek());
System.out.println(t.poll());

for(int x:t)
{
	System.out.println(x);}
	}

}
