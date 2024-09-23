package array8;

public class cnt {
	public static void main(String[] args) {
		String a[]= {"abc","88","bye","100","good","0"};
		
		
		// integer =>  positive and negative 
		// count numer of positive or negatve 
		//count number of zeros 
		
		
		for(String x:a)
		{
			System.out.println(x);
		}
		
		int counts=0;
		int countn=0;
		
		for(int i=0;i<a.length;i++)
		{
			try {
		int j=	Integer.parseInt(a[i]);
		countn++;
			}
			catch(Exception e)
			{
				counts++;
			}
		}
		
		System.out.println("Number of string element "+ counts);
		System.out.println("Number of integer eleent "+ countn);
		
	}

}
