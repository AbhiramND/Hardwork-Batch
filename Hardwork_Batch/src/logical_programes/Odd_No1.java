package logical_programes;

public class Odd_No1 
{
	public static void main(String[] args)
	{
		disp(1236,0);
	}
	

		static void disp(int no,int sum)
		{
			while(no!=0)
			{
				int rem=no%10;
				if(rem%2==1)
				{
					sum=sum+rem;
				}
				no=no/10;
			}
			System.out.println(sum);
		}
	

}
