package tp07_batch_Sumanth;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 9, 14, 45, 65, 25, 58, 75, };
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
}
