package stringLogical;

public class Str7 
{
	public static void main(String[] args) {
		
	
	String s1="my name is Ram";
	String [] arr = s1.split(" ");
	for(int i=0;i<=arr.length-1;i++)
	{
		if(i%2==0)
		{
		System.out.print(rev(arr[i])+" ");
	}
	}
	}
	static String rev(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
		
	}
}
