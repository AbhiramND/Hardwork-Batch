package patternMatching;

import java.util.Scanner;

public class VerticalDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();

        // Upper
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            printStars(2 * i - 1);
            System.out.println();
        }

        // Lower 
        for (int i = n - 1; i >= 1; i--) {
            printSpaces(n - i);
            printStars(2 * i - 1);
            System.out.println();
        }
        sc.close();
    }

    //  spaces
    static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    // stars
    static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
}

