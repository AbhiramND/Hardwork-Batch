package tp07_batch_Sumanth;

public class ReverseTheStringWithOutReverseSpace {
	public static void main(String[] args) {
		String s = "raju is handsome";
		String s1 = s.replaceAll(" ", "");
		int index = s1.length() - 1;
		for (int i = 0; i <= s.length()-1; i++) {
			if (s.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print(s1.charAt(index--));
			}
		}
	}
}
