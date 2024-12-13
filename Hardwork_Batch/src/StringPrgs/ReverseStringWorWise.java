package StringPrgs;

public class ReverseStringWorWise {
	public static void main(String[] args) {
		String s = "find the Largest String";
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
//			if (i == 2) {
				System.out.print(rev(arr[i]) + " ");
			
		}

	}

	static String rev(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;

	}

}
