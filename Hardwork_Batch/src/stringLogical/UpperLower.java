package stringLogical;

public class UpperLower 
{
	public static void main(String[] args) {
		String s="JaVaLaVa";
		String rev="";
		for (int i=0;i<=s.length()-1;i++) 
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				rev=rev+Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				rev=rev+Character.toUpperCase(ch);
			}
		}
		System.out.println(rev);
	}

}
