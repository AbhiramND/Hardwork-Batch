package patternMatching;

public class SpecialCharactorSquareBox {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int k=1;
			for (int j = 1; j <= 4; j++) {
				if (i == j) {
					System.out.print(k+" ");
					
				} else if ((j - i) == 1 || (i - j) == 1) {
					System.out.print("@ ");
				} else if ((j - i) == 2 || (i - j) == 2) {
					System.out.print("# ");
				} else if((j - i) == 3 || (i - j) == 3){
					System.out.print("* ");
				}
				k++;
				
			}
			System.out.println();
		}
	}
}
