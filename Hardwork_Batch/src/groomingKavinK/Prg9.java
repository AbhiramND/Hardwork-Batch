package groomingKavinK;

public class Prg9 {

	public static void main(String[] args) 
	{
		int no=28;
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
				
		}
		System.out.println(sum);

	}

}
