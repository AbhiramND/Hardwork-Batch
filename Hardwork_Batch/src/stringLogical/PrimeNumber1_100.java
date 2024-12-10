package stringLogical;

public class PrimeNumber1_100 
{
	public static void main(String[] args) 
	{
		int num=0;
		for(int j=1;j<=100;j++)
		{
			int no=j;
			int count=0;
			
			for(int i=1;i<=no;i++)
			{
				if(no%i==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				num++;
				System.out.print(no+" ");
			}
			
			
		}
		System.out.println(num);//number of prime no in 1-100 is 25
		
	}

}
