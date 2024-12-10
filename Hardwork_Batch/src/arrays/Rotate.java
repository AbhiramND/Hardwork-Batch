package arrays;

public class Rotate {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
//		arr=rotate(arr,1);
		for (int i : rotate(arr,1)) {
			System.out.print(i+" ");
		}
	}
	static int[] rotate(int []arr,int times)
	{
		times=times%arr.length;
		System.out.println(times);
		int []rotate=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rotate[(i+times)%arr.length]=arr[i];
			}
		return rotate;
	}

}
