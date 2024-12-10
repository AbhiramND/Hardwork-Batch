package stringLogical;

public class RecursiveString1 {

	
	static void disp(String s,int i)
	{
		if(i==s.length())
		{
			return;
		}
		disp(s,i+1);
		System.out.print(s.charAt(i));
	}
	public static void main(String[] args) {
		disp("mobile",0);
		
	}
}
