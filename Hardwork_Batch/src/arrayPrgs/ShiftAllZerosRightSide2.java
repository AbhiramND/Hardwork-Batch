package arrayPrgs;

import java.util.Arrays;

public class ShiftAllZerosRightSide2 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 0, 5, 0, 5, 1, 0 };//
		int[] b = new int[arr.length];
		int index = 0;
		int[] arr2=null;
		for (int i = 0;i<arr.length; i++) {
			if (arr[i] != 0) {
				b[index++] = arr[i];
				
			}
		}
		arr2=Arrays.copyOf(b, index);
//		System.out.println(Arrays.toString(arr2));
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
