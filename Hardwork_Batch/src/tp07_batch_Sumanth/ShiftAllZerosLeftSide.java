package tp07_batch_Sumanth;

import java.util.Arrays;

public class ShiftAllZerosLeftSide {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 0, 5, 0, 5, 1, 0 };//
		int[] b = new int[arr.length];
		int index = b.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				b[index--] = arr[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
