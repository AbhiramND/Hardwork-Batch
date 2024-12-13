package arrayPrgs;

public class SmallestNo {
	public static void main(String[] args) {
		int []arr= {1,5,6,9,7,15,6,4,8};
		int small=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println(small);
	}

}
