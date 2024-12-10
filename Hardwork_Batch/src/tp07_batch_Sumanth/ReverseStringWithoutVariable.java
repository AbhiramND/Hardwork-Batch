package tp07_batch_Sumanth;

public class ReverseStringWithoutVariable {

	public static void main(String[] args) {
		String s = "india";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s))
			System.out.println(rev + " it is a palindrome");
		else
			System.out.println(rev + " it is not a palindrome");

	}

}
