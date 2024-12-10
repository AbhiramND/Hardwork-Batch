package tp07_batch_Sumanth;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String s = "aabbabac";
		LinkedHashSet set = new LinkedHashSet();
		for (char ch : s.toCharArray()) {
			set.add(ch);
		}
		System.out.println(set);
	}
}
