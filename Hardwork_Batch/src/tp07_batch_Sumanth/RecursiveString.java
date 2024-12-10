package tp07_batch_Sumanth;

public class RecursiveString {

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
		disp("india",0);
		
	}
}
