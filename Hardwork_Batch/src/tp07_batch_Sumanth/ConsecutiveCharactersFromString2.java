package tp07_batch_Sumanth;

public class ConsecutiveCharactersFromString2 {

	public static void main(String[] args) {

		String s = "aaabbaabacc";
		StringBuilder builder = new StringBuilder();

		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				builder.append(s.charAt(i)).append(count);
				count = 1;
			}
		}

		System.out.println(builder.toString());
	}

}
