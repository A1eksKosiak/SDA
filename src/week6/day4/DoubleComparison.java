package week6.day4;

public class DoubleComparison {
    public static void main(String[] args) {

        double v1 = 1.3d / 3.1d;
        double v2 = 3.9d / 9.3d;

        System.out.println(isEqual(v1, v2, 0.000001)); // delta
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
    }

    public static boolean isEqual(double d1, double d2, double delta) {
        return Math.abs(d1 - d2) < delta;
    }
}
