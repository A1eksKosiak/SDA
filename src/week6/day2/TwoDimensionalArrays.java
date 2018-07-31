package week6.day2;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
