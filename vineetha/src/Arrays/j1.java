package Arrays;

public class j1 {

	public static void main(String[] args) {
		
		/*0
		 *1,2
		 *
		 *3 4 5
		 *
		 *6 7 8 9
		 *10 11 12 13 15
		 ** 
		 * */
		
		int row=5;
		int a[][]= new int[row][];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]= new int[i+1];
		}
		
		//initialise
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=count++;
			}
		}
		System.out.println("displaying");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
