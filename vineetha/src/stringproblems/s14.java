package stringproblems;

public class s14 {
	public static void main(String[] args) {
		
		String s="00123";
		String result="";
		int digit=0;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c!='0')
			{
				digit=i;
				break;
			}
		}
		
		result=s.substring(digit, s.length());
		System.out.println(result);
	}

}
