package StringPrgs;

public class RecursiveString {
	public static void disp(String s, int i)
	{
		if(i==s.length())
		{
			return;
		}
		disp(s,i+1);
		System.out.print(s.charAt(i));
	}
	public static void main(String[] args) {
		String s="hello";
		int no=0;
		disp(s,no);
		
	}

}
