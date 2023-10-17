package org.example;

import java.util.Arrays;
import java.util.List;

public class Lab {

    public final int cardNumber = 1130;

    private final int C5 = cardNumber % 5; // 0
    private final int C7 = cardNumber % 7; // 3
    private final int C11 = cardNumber % 11; // 8

    public Lab() {}

    public void calc(int a, int[][] B) {
        try {
            this.showMatrix(B, "Initial matrix");
            this.multiply(B, a);
            this.showMatrix(B, "Matrix after multiplying");
            this.calcAverage(B);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showMatrix(int[][] matrix, String text) {
        System.out.println(text);
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }

    public void multiply(int[][] matrix, int c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= c;
            }
        }
    }

    public void calcAverage(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int el : matrix[i]) {
                sum += el;
            }
            System.out.println("Average of the row " + (i + 1) + " is " + (double) sum / (double) matrix[i].length);
        }
    }
}
