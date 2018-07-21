package com.hackerrank.warmup;

public class BirthdayCakeCandles {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int counter = 1;
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                counter = 1;
            } else if ((ar[i] == max) && (i != 0)) {
                counter++;
            }
        }
        return counter;

    }

    public static void main(String[] args) {
        int[] ar = new int[]{3, 5, 7, 5, 7, 7, 7, 2, 1, 3};

        System.out.println(birthdayCakeCandles(ar));

    }

}
