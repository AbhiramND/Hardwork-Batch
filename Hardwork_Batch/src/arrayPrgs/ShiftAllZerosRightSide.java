package arrayPrgs;

import java.util.Arrays;

public class ShiftAllZerosRightSide {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 0, 5, 0, 5, 1, 0 };//
		int[] b = new int[arr.length];
		int index = 0;
		
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != 0) {
				b[index++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
