package StringPrgs;

public class ConcatinateNumbersAndAdd {

	public static void main(String[] args) {
		String s = "a123b89c";
		String s1 = "";
		int sum = 0;
		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				s1 = s1 + s.charAt(ch);
				int c = Character.getNumericValue(ch);
				sum += c;
			}
		}
		System.out.println(s1);
		System.out.println(sum);
	}
}
