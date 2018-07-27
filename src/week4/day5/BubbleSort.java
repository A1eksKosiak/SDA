package week4.day5;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int size = scanner.nextInt();
        System.out.println("Please enter array");
        int[] array = new int[size];
        //reading array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        //sorting
        int tempValue;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j >= i + 1; j--) {
                count++;
                if (array[j] < array[j - 1]) {
                    tempValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempValue;
                }
            }
        }

        //printing
        System.out.println(Arrays.toString(array));
        System.out.println(count);


    }
}
