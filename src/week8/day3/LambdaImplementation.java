package week8.day3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaImplementation {
    public static void main(String[] args) {

        runItSafe(LambdaImplementation::divide4By, 2);

        runItSafeTwoArguments(LambdaImplementation::divide, 2, 10);
        //Lambda implementation
        runItSafeTwoArguments((arg1, arg2) -> {
            int ans = arg1 / arg2;
            System.out.println(ans);
        }, 2, 10);
        runItSafeTwoArguments((arg1, arg2) -> System.out.println(arg1 / arg2), 10, 5);  //Lambda implementation

//        int res = runItSafeReturnInteger(() -> {
//            return 20 / 2;
//        });
//        System.out.println(res);
        System.out.println(runItSafeReturnInteger(() -> 20 / 2));

    }

    public static Integer runItSafeReturnInteger(Supplier<Integer> func) {
        try {
            return func.get();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public static void runItSafe(Consumer<Integer> func, Integer arg) {
        try {
            func.accept(arg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void runItSafeTwoArguments(BiConsumer<Integer, Integer> func, Integer arg1, Integer arg2) {
        try {
            func.accept(arg1, arg2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide(Integer val1, Integer val2) {
        int answer = val2 / val1;
        System.out.println(answer);
    }

    public static void divide4By(Integer val) {
        int answer = 4 / val;
        System.out.println(answer);
    }
}

