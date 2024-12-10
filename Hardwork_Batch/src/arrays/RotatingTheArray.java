package arrays;

public class RotatingTheArray 
{
	public static void main(String[] args) {
		int []arr= {2,4,5,6,8};
		int times=1;
		for(int j=1;j<=times;j++)
		{
			int temp=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				arr[i+1]=arr[i];
			}
			arr[arr.length-1]=temp;
			
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
			
		}
	}
	

}
