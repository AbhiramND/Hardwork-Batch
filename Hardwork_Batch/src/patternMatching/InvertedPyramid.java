package patternMatching;

public class InvertedPyramid {
	public static void main(String[] args) {
		int rows = 8;
//		for (int i = rows; i >= 1; i--) {
//			for (int j = rows; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		for (int i = 1; i <= rows*2; i++) {
			for (int j = 1; j <= rows * 2 -1; j++) {
				if(i>=j&&i+j <=rows*2||i+j>=rows*2 && i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
