package ass2;

import java.util.HashSet;

public class StringPangram {

	public static boolean isPangram(String str) {
//		str = str.toLowerCase();
		HashSet<Character> set = new HashSet<>();

		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				set.add(c);
			}
		}
		return set.size() == 26;
	}

	public static void main(String[] args) {
		String testString = "The quick brown fox jumps over the lazy dog";
		if (isPangram(testString)) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not a pangram.");
		}
	}
}
