package sprr;

public class child1 extends parent1{

	double salary;
	
	public child1( int id,String n,double salary) {
		
		super(id,n);//reusing the constructor 
		this.salary=salary;
	}
	
	
	public void printingdetails()
	{
		System.out.println("Name is "+ n);
		System.out.println("id is "+ id);
		System.out.println("Salary is "+ salary);
	}
	
	
	public static void main(String[] args) {
		
		child1 c= new child1(20,"dhivya",4000);
		c.printingdetails();
	}
}
