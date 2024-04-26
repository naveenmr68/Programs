package Logics;

public class PatternProgram {
    public static void printPyramid(int n) {
        // Printing the upper pyramid
        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // Printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + j + " ");
            }
            System.out.println();
        }
        
        // Printing the middle row if n is odd
        if (n % 2 == 1) {
            for (int i = 0; i < n / 2; i++) {
                System.out.print("  ");
            }
            System.out.print(n + " * ");
            for (int i = 1; i < n; i++) {
                System.out.print(n);
                if (i != n - 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println(n);
        }
        
        // Printing the lower pyramid
        for (int i = n; i >= 1; i--) {
            // Printing spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // Printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printPyramid(1);
        System.out.println();
        printPyramid(2);
        System.out.println();
        printPyramid(3);
    }
}
