package patternMatching;

public class UpperPyramid {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 0; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
