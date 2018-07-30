package week4.day5;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] array = new int[]{1, 6, 2, 3, 8, 13, -3, -60,100};

        mergeSort(array);

        //printing
        System.out.println(Arrays.toString(array));

    }

    static void mergeSort(int[] list) {

        if (list.length <= 1) {
            return;
        }

        //divide array into 2 smaller
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];

        //copy data from array
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, list);

    }

    static void merge(int[] first, int[] second, int[] result) {

        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);

    }
}
