package patternMatching;

public class Pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j >= 1 || i + j >= 2 || i + j >= 3 || i + j >= 4) {
					System.out.print(i + " ");
				}
			}
			System.out.println(" ");
		}
	}
}
