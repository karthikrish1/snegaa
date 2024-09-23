package methods;

public class m5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //other than void
		//          add return statement at end
		//          call within sysout statement
		m5 ob= new m5();
		System.out.println("Addition is "+ ob.addition());
		System.out.println("Average is "+ ob.average());
		
	}
	public int addition()
	{
		int a=4;
		int b=30;
		int c=a+b;
		return c;
	}
	private double average()
	{
		double m=3.4;
		double n=2.3;
		return (m+n)/2;
	}

}
