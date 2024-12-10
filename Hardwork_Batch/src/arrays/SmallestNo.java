package arrays;

public class SmallestNo {

	public static void main(String[] args) {
		int[] arr = { 16, 22, 333, 55, 44, 85, 94, 121, 115, 156, 188 };
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println(small);
	}
}
