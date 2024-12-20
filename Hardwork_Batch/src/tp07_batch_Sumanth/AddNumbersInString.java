package tp07_batch_Sumanth;

public class AddNumbersInString {
	public static void main(String[] args) {
		String s = "12345abcd1234512345";
		int sum = 0;
		for (char ch : s.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				sum += ch - 48;
			}
		}
		System.out.println(sum);
	}
}
