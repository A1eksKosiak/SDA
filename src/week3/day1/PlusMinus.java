package week3.day1;

import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr) {

        double minusNumber = 0;
        double zeroNumber = 0;
        double plusNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                minusNumber++;
            } else if (arr[i] > 0) {
                plusNumber++;
            } else {
                zeroNumber++;
            }
        }
        System.out.println(plusNumber/arr.length);
        System.out.println(minusNumber/arr.length);
        System.out.println(zeroNumber/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
