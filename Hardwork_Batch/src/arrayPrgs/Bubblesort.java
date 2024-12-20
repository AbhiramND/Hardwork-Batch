package arrayPrgs;

public class Bubblesort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 4, 7, 6 };
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 1 + i; j <= arr.length - 1; j++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
