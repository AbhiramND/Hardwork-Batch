package stringLogical;

public class Str11 {

	public static void main(String[] args) {
		String s="movie";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{
				System.out.print(ch);
			}
			
			
		}
	}

}
