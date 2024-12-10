package groomingKavinK;

public class Prg2 {

	public static void main(String[] args) {
		int no=29;
		boolean isPrime=true;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				isPrime =false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("its prime No");
		}

	}

}
