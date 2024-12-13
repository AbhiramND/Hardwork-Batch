package tp07_batch_Sumanth;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 32, 45, 31, 5, 4, 67, 45, 32, 48, 96 };
		int sec_large=Integer.MIN_VALUE;
		int large=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>large) {
				sec_large=large;
				large=arr[i];
			}else if(arr[i]>sec_large&&arr[i]!=large) {
				sec_large=arr[i];
			}
		}
		System.out.println(sec_large);
	}
}
