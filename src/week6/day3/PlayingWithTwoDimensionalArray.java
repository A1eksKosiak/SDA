package week6.day3;

import java.util.Arrays;
import java.util.Scanner;

public class PlayingWithTwoDimensionalArray {

    private static int[][] array;

    public static void main(String[] args) {
//        generateArray();
        getArrayFromUser();
        printArray();
        System.out.println(getMax(array));
    }

    public static void getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array size");
        int size = scanner.nextInt();

        System.out.println("Insert numbers for your array");

        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] generateArray() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static void printArray() {
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int getMax(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}