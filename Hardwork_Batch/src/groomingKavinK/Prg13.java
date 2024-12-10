package groomingKavinK;

public class Prg13 {

	public static void main(String[] args)
	{
		int no=133548524;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			count++;
			no=no/10;
		}
		System.out.println(count);

	}

}
