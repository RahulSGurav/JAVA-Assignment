import java.util.*;
public class Matrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] A = new int[2][2];
            int[][] B = new int[2][2];
            int[][] result = new int[2][2];

            // Input for Matrix A
            System.out.println("Enter 1st Matrix A:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Input for Matrix B
            System.out.println("Enter 2nd Matrix B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Addition
            System.out.println("Addition of A and B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = A[i][j] + B[i][j];
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

            // Subtraction
            System.out.println("Subtraction of A and B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = A[i][j] - B[i][j];
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

            // Multiplication
            System.out.println("Multiplication of A and B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }


            System.out.println("Transpose of Matrix A:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(A[j][i] + " ");
                }
                System.out.println();
            }


            System.out.println("Transpose of Matrix B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(B[j][i] + " ");
                }
                System.out.println();
            }


        }
    }


