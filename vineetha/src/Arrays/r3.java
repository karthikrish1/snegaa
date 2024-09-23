package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class r3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[]= {2,3,4,5};
	System.out.println(Arrays.toString(s));
	int index=2;
	 int[] d = r3.rem(s, index);
	System.out.println(Arrays.toString(d));
	}

	public static int[] rem(int a[],int index)
	{
		if(a==null || index<0 ||index>=a.length)
		{
			return a;
		}
		return IntStream.range(0,a.length).filter(i-> i!=index).map(i-> a[i]).toArray();
	}
}
