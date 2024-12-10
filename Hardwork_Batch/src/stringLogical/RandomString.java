package stringLogical;

public class RandomString {
	public static void main(String[] args) {
		String s = "hello world i have Arrived";
		String s1 = s.replaceAll(" ", "");
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		for (int i = 0; i < rev.length(); i = i + 3) {

			if (i + 5 < rev.length()) {
				System.out.print(rev.substring(i, i + 3) + " ");

			} else {

				System.out.print(rev.substring(i)+" ");
			}
		}
	}
}
