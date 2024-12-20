package patternMatching;

public class MirrorTriangle {

    // Method to print the mirror triangle pattern
    public static void printMirrorTriangle(int n) {
        for (int i = 1; i <= n; i++) { // Rows from 1 to n
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        int n = 5; // Parameter for the size of the triangle
        printMirrorTriangle(n);
    }
}

