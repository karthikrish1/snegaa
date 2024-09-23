package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {

	public static void main(String[] args) {
		/*
		 * queue
		 * 
		 *  not indexed
		 *  add
		 *  remove
		 *  retrive only head of the queue
		 *  accept duplicates
		 *  
		 *  arrayblockingqueue
		 *  deque
		 *  ArrayBlockingQueue<Datatype>name= new ArrayBlockingQueue<>(size);
		 * 
		 * * 
		 * */
		
		 ArrayBlockingQueue<Double>n= new ArrayBlockingQueue<>(4);
		 n.add(2.3);
		 n.add(10.4);
		 n.add(1.0);
		 n.add(99.4);
		 System.out.println(n);
		 
		 //remove : mention the value
		 //n.remove();//removes first element
		 n.remove(10.4);
		 System.out.println(n);
		 
		 System.out.println(n.peek());
		 System.out.println(n.poll());
		 
		 //remove, poll: remove the first element of queue
		 // queue is empy
		 //remove: throws error
		 // poll: it will not throw error
		 System.out.println(n);
		 
		 for(double x:n)
		 {
			 System.out.println(x);
		 }
		 

	}

}
