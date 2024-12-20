package patternMatching;

public class ButterFly {

	public static void main(String[] args) {
		int rows = 4;
		for (int i = 1; i <= rows * 2 - 1; i++) {
			for (int j = 1; j <= rows * 2 - 1; j++) {
				if (i >= j && i + j <= rows * 2 || i + j >= rows * 2 && i <= j) {
					
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
