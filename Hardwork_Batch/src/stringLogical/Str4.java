package stringLogical;

public class Str4 {

	public static void main(String[] args) 
	{
		String s ="find the SmallestString asdfghjkllkjhgfdsasdfghjkdfgh";
		System.out.println(disp(s));
		
	}

  static String disp(String s1)
 {
	 String[]arr=s1.split(" ");
		String s2=arr[0];
		for(String s3:arr)
		{
			if(s3.length()<s2.length())
			{
				s2=s3;
			}
		}
		return s2;
 }
		

	}


