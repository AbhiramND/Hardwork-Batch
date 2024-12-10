package stringLogical;

public class NoWordsInString 
{
	public static void main(String[] args) {
		String s="my name is super star mb";
		String [] arr=s.split(" ");
		int words =0;
		for(String a:arr)
		{
			words++;
		}
		System.out.println(words);
	}

}
