package ru.job4j;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i <= size - 1 ; i++) {
            for (int j = 0; j <= size - 1; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
