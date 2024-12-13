package tp07_batch_Sumanth;

public class ExpandString {
	public static void main(String[] args) {
		String s = "a2b2c2a2d3";
		for (int i = 0; i < s.length() - 1; i = i + 2) {
			char ch = s.charAt(i);
			int count = s.charAt(i + 1) - 48;
			for (int j = 1; j <= count; j++) {
				System.out.print(ch);
			}
		}
	}
}
