package week6.day3;

import java.util.Arrays;

public class BubbleSortForTwoDimensionalArray {

    private static int[][] array;

    public static void main(String[] args) {

        generateArray();
        System.out.println("Generated array:");
        printArray();
        System.out.println("-----------------------------------------------");
        sortArray();
        System.out.println("Sorted array");
        printArray();
    }

    private static void sortArray() {

        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > temp[i]) {
                    temp[i] = array[i][j];
                }
            }
        }
        System.out.println("Max values of each row, unsorted");
        System.out.println(Arrays.toString(temp));
        System.out.println("-----------------------------------------------");

        int tempValue;
        int[] tempArray;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i + 1; j--) {
                if (temp[j] > temp[j - 1]) {
                    tempArray = array[j];
                    tempValue = temp[j];
                    array[j] = array[j - 1];
                    temp[j] = temp[j - 1];
                    array[j - 1] = tempArray;
                    temp[j - 1] = tempValue;
                }
            }
        }
        System.out.println("Max values sorted");
        System.out.println(Arrays.toString(temp));
        System.out.println("-----------------------------------------------");

    }

    private static void generateArray() {
        int size = 5;
        array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    private static void printArray() {
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
