package week6.day4;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(1, 3, 6, 2, 4, 6, 2, 1, 6, 1));
        System.out.println(divide(1, 3, 6, 2, 4, 6, 2, 1, 6, 1));
        System.out.println(multiply(1, 3, 6, 2, 4, 6, 2, 1, 6, 1));
        System.out.println(extract(1, 3, 6, 2, 4, 6, 2, 1, 6, 1));
    }

    public static int add(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static double divide(int... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result /= numbers[i];
        }
        return result;
    }

    public static int multiply(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }

    public static int extract(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

}