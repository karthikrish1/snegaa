package builtinclasses;

import java.util.Random;
import java.util.stream.DoubleStream;

public class r1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random r= new Random();
System.out.println(r.nextInt(3));// 0 to 3
System.out.println(r.nextDouble());   //between 0 to 1
System.out.println(r.nextFloat());  //between 0 to 1
System.out.println(r.nextBoolean());

	}

}
