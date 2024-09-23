package conversionn;

public class a1 {
public static void main(String[] args) {
	//calculate average of ascii value of a word
	
	String s="hi welcome first";
	calculate(s);
	
}
public static void calculate(String s)
{
	String word=" ";
	int sum=0;
	int l=s.length();
	
	for(int i=0;i<l;i++)
	{
		//if character is a space 
		if(s.charAt(i)==' ')
		{
			int average=sum/word.length();
			System.out.println(word + ": "+ average);
			word=" ";
			sum=0;
		}
		
		else
		{
			sum+=s.charAt(i);
			word+=s.charAt(i);
		}
	}
	
	//last word ; calculation
	int average=sum/word.length();
	System.out.println(word + ": "+ average);
	}
}
