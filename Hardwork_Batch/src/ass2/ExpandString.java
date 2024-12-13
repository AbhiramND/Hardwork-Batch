package ass2;
public class ExpandString {
	public static void main(String[] args) {
		String s = "p2q3r4s5";
		for (int i = 0; i < s.length() - 1; i = i + 2) {
			char ch = s.charAt(i);
			int count = s.charAt(i + 1) - 48;
			for (int j = 1; j <= count; j++) {
				System.out.print(ch);
			}
		}
	}
}