package patternMatching;

public class VerticalDiamondPyramid {
	public static void main(String[] args) {

		int rows = 5;
		for (int i = 0; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i + (i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i+(i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
