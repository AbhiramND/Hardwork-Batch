package logical_programes;

public class Even_No {

	public static void main(String[] args) {
		disp();

	}
	static void disp()
	{
		int no =1236;
		int sum=0;
		while(no!=0)
		{
			int rem =no%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			no=no/10;
		}
		System.out.println(sum);
	}
}
