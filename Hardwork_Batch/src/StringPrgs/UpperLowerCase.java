package StringPrgs;

public class UpperLowerCase {
public static void main(String[] args) {
	String s="javaLAVA123";
	String up="";
	String low="";
	String no="";
	for(int i=0;i<=s.length()-1;i++)	
	{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
			up=up+ch;
		}
		else if(Character.isLowerCase(ch))
		{
			low=low+ch;
		}
		else if(Character.isDigit(ch))
		{
			no=no+ch;
		}
		
		
	}
	System.out.print(low.toUpperCase());
	System.out.print(up.toLowerCase());
	System.out.print(Integer.parseInt(no));
}
}
