package arrays;

import java.util.Arrays;

public class ArrayAddition {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int max = Math.max(a.length, b.length);
		int[] sum = new int[max];
		for (int i = 0; i < sum.length; i++) {
			if (i < a.length) {
				sum[i] += a[i];
			}
			if (i < b.length) {
				sum[i] += b[i];
			}
		}System.out.println(Arrays.toString(sum));
	}
}
