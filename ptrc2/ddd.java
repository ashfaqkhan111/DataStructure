package ptrc2;

import java.util.Scanner;

public class ddd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter matrix size (n): ");
        int n = in.nextInt();

        double[][] Matrix = new double[n][n + 1];

        System.out.println("Enter matrix values:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                Matrix[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {

            double pivot = Matrix[i][i];

            for (int j = 0; j < n + 1; j++) {
                Matrix[i][j] /= pivot;
            }

            for (int k = 0; k < n; k++) {

                if (k != i) {

                    double factor = Matrix[k][i];

                    for (int j = 0; j < n + 1; j++) {
                        Matrix[k][j] -= factor * Matrix[i][j];
                    }
                }
            }
        }

        System.out.println("Solution:");

        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i+1) + " = " + Matrix[i][n]);
        }
    }
}