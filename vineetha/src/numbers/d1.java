package numbers;

public class d1 {

	public static void main(String[] args) {
		
		//duck number: number which is having zeros in it
		//001223 => not a ducknumber
		//0010223 -> duck number
		
		String num="203";
		boolean result = duckch(num);
		if(result==true)
		{
			System.out.println("duck");
		}
		
		else
		{
			System.out.println("not");
		}
	}
	
	public static boolean duckch(String n)
	{
		int n1=n.length();
		int i=0;
		while(i<n1 && n.charAt(i)=='0')
			i++;
		
		while(i<n1)
		{
			if (n.charAt(i)=='0')
				return true;
			i++;
		}
		return false;
		
	}
}
