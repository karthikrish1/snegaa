package regularexpressions;

//regular expression to find the datatype

public class r3 {
	public static void main(String[] args) {
		
		//String age="12";
		//System.out.println(age.getClass().getName());
		
		String i="03/12/1991";
		String result=null;
		
		// integer=> \\d
		
		if(i.matches("\\d+"))
		{
			result="java.lang.Integer";
		}
		
		//double=>  \\d*[.]\\d+   
		
		else if(i.matches("\\d*[.]\\d+"))
		{
			result="java.lang.Double";
		}
			
		
		
		//first format: dd/mm/yyyy   or  mm/dd//yyyy => \\d{2}[/]\\d{2}[/]\\d{4}
		
		else if(i.matches("\\d{2}[/]\\d{2}[/]\\d{4}"))
				{
			result="java.lang.Date";
				}
		 
		//third format   dd-mon-yyyy      
		
		else if(i.matches("\\d{2}[-]\\w{3}[-]\\d{4}"))
		{
	result="java.lang.Date";
		}
		
		//fourth/fifth format   dd-month-yy   or dd-month-yyyy
		
		else if(i.matches("\\d{2}[-]\\w+[-]\\d{4}"))
		{
	result="java.lang.Date";
		}
		
		//sixth format   yyyy-mm-dd
		
		
		
		else if(i.matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
		{
	result="java.lang.Date";
		}
		
		System.out.println(result);
	}

}
