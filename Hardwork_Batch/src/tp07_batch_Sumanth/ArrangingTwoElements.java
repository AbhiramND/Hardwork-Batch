package tp07_batch_Sumanth;

import java.util.LinkedHashSet;

public class ArrangingTwoElements {

	public static void main(String[] args) {
		int[] a = { 10, 5, 7, 8, 6, 9, 9, 10, 7 };
		int sum = 15;
		LinkedHashSet<String> set = new LinkedHashSet<String>();// a[i]>a[i+1]?"("+a[i]+","+a[i+1]+")":"("+a[i+1]+","+a[i]+")"
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					String str = a[i] > a[j] ? "(" + a[i] + "," + a[j] + ")" : "(" + a[j] + "," + a[i] + ")";
					set.add(str);
				}
			}
		}
		System.out.println(set);
	}
}
