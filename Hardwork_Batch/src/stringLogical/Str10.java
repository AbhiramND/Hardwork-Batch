package stringLogical;

public class Str10 {
	public static void main(String[] args) {
		String s="movie";
	
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.print(ch);
			}
			
			
		}
	}

}
