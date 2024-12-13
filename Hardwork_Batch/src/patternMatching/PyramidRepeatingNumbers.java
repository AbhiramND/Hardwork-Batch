package patternMatching;

public class PyramidRepeatingNumbers {
	public static void main(String[] args) {
		int rows = 4;
		for (int i = 1; i <= rows; i++) {
			// Print leading spaces
			for (int j = rows; j > i; j--) {
				System.out.print("  ");
			}
			// Print the same number
			for (int j = 1; j <= (2 * i -1); j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
