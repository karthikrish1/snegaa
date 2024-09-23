package Arrays;

public class smwornot {
	public static void main(String[] args) {
		int a[][]= {{1,9},{8,6},{4,0}};
		int b[][]= {{1,9},{8,6},{4,0}};
		
int r1=a.length;
		int r2=b.length;
		int c1=a[0].length;
		int c2=b[0].length;
		boolean l=true;
		//checking the length
		if(r1!=r2 || c1!=c2)
		{
			System.out.println("they are not equal ");
		}
		//if length matches, check for elemens
		else
		{
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						l=false;// there is a mismtach  => l=false
						break;
					}
				}
			}
			
		if(l==true)
		{
			System.out.println("they are equal");
		}
		
		else {
			System.out.println("they are not equl");
		}
		}
		
				
		
	}

}
