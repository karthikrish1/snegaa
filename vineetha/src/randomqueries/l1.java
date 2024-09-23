package randomqueries;

import java.text.DecimalFormat;

public class l1 {

	public static void main(String[] args) {
		l1.percentage("Kdhivya123@33");
		}
	public static void percentage(String input)
	{
		int total=input.length();
		
		int uppercase=0;
		int lowercase=0;
		int digits=0;
		int others=0;
		
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch)
					) {
				lowercase++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else
			{
				others++;
			}
		}
		
		//find percentage:   uppercase*100/total 
		double up = (uppercase*100.0)/total;
		double lp = (lowercase*100.0)/total;
		double ddp = (digits*100.0)/total;
		double op = (others*100.0)/total;
		
		DecimalFormat f=new DecimalFormat("##.##");
		
		System.out.println("Uppercase percentage "+ f.format(up));
		System.out.println("lowercase percentage "+ lp);
		System.out.println("digits percentage "+ ddp);
		System.out.println("others percentage "+ op);
	}
}
