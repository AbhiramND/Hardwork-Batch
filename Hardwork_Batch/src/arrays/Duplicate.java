package arrays;

public class Duplicate {
	public static void main(String[] args) {
		int[] arr = {  2, 2, 3, 4, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
				}

			}

		}
		for (int k : arr) {
			if (arr[k] != 0) {
				System.out.print(arr[k]);
			}
		}

	}

}
