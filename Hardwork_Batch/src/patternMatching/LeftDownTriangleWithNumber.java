package patternMatching;

public class LeftDownTriangleWithNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int k=1;
			for (int j = 1; j <= 5; j++) {
				if ((i + j) >= 6) {
					System.out.print(k+" ");
					k++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
 