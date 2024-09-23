package exceptionhandling;

public class e3 {

	public static void main(String[] args) {
		
		// finally: optional; always execute
		
		// error :  try, catch, finally
		// no error: try, finally
		
		try {
			System.out.println(6/1);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("bye");
		}
	}
}
