package groomingKavinK;

public class PrimeNo 
{ 
	public static void main(String[] args) {
		int no=97;
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
