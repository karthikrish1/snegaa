package spr;

public class child extends parent{
//super=> points to parent property
	int age=40;
	public static void main(String[] args) {
		
		child c= new child();
		c.display();
	}
	
	
	public void display()
	{
		System.out.println("Age is "+ age);
		System.out.println("Age in parent is "+ super.age);
	}
}
