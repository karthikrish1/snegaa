package methods;

public class m4 {

	public static void main(String[] args) {
		m4.display();
		//classname objectname= new classname();
		// objectname.methodname();
		m4 ob=new m4();
        ob.rectangle();
        ob.addition();
        
        //class: public : void: division of two numbers
        //      private:  void :  product of three numebrs 

	}
	
	public static void display()
	{
		System.out.println("hi");
	}
	
	public void rectangle()
	{
		double l=3.4;
		double b=0.2;
		System.out.println("Area of rectangle is "+ l*b);
	}
	
	private void addition()
	{
		float a=3.4f;
		float b=2.3f;
		System.out.println("addition is "+ (a+b));
	}

}
