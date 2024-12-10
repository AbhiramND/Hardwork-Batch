package groomingKavinK;

public class Prg12 {

	public static void main(String[] args) {
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		System.out.println(sum);
	}
}
