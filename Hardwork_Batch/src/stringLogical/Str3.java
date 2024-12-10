package stringLogical;

public class Str3 {
	public static void main(String[] args) 
	{
		String s="find the LargestString ASDFGHJKLKJHGFDS";
		String[]arr=s.split(" ");
		String s1="";
		for(String s2:arr)
		{
			if(s2.length()>s1.length())
			{
				s1=s2;
			}
		}
		System.out.println(s1);
		
	}

}
