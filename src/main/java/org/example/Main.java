package org.example;

public class Main {
    public static void main(String[] args) {
        Lab lab = new Lab();

        int[][] matrix = {
            {1, 33, 4, -63},
            {3, 7, 12, -1},
            {-12, 41, 12, 3},
            {1, 0, 5, 71},
            {6, -13, 45, 2}
        };

        int a = 23;

        lab.calc(a, matrix);
    }
}