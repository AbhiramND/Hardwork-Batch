package groomingKavinK;

public class Prg6 {

	public static void main(String[] args) {
		int no=15563;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);

	}

}
