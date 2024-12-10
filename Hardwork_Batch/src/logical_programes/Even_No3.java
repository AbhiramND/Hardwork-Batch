package logical_programes;

public class Even_No3 
{
	public static void main(String[] args) {
		disp(10);

	}
	static void disp( int no)
	{
		while(no>=0)
		{
			
			if(no%2==0)
			{
				System.out.println(no);
			}
			
			no--;
		}
		
	}

}
