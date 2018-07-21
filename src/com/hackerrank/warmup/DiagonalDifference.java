package com.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

        int sumOfFirstDiagonal = 0;
        int sumOfSecondDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sumOfFirstDiagonal += arr[i][j];
                }
                if (j == arr.length - i - 1) {
                    sumOfSecondDiagonal += arr[i][j];
                }
            }
        }
        return Math.abs(sumOfFirstDiagonal - sumOfSecondDiagonal);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[][]{{-1, 1, -7, -8}, {-10, -8, -5, -2,}, {0, 9, 7, -1,}, {4, 4, -2, 1}};

        System.out.println(diagonalDifference(arr));
    }

}
