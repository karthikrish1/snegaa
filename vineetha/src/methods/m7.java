package methods;

public class m7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m7 ob=new m7();
		ob.sq(4);
		// name, afe, address_
		System.out.println("addition is "+ ob.addition(2, 3, 4));

	}
	
	public  void sq(int s)
	{
		System.out.println("area is "+ s*s);
	}
	
	public int addition(int a,int  b, int c)
	{
		return a*b*c;
	}

}
