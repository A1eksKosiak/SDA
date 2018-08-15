package week8.day3;

import java.util.function.*;

public class LambdaImplementation {
    public static void main(String[] args) {

        runItSafeConsumer(LambdaImplementation::divide4By, 2);

        runItSafeBiConsumer(LambdaImplementation::divide, 2, 10);
        //Lambda implementation
        runItSafeBiConsumer((arg1, arg2) -> {
            int ans = arg1 / arg2;
            System.out.println(ans);
        }, 2, 10);
        runItSafeBiConsumer((arg1, arg2) -> System.out.println(arg1 / arg2), 10, 5);  //Lambda implementation

//        int res = runItSafeSupplier(() -> {
//            return 20 / 2;
//        });
//        System.out.println(res);
        System.out.println(runItSafeSupplier(() -> 20 / 2));

        System.out.println(runItSafeSupplier(() -> {
            int sum = 0;
            for (int i = 1; i <= 50; i++) {
                sum += i;
            }
            return sum;
        }));

        //Function takes value and returns value
        System.out.println(runItSafeFunction((element) -> {
                    int temp = 100 / element;
                    System.out.println(temp);
                    return temp;
                }
                , 10));
        //BiFunction takes 2 parameters and returns one value
        System.out.println(runItSafeBiFunction((element1, element2) -> element1 / element2, 50, 2));

    }

    public static Integer runItSafeFunction(Function<Integer, Integer> func, Integer arg1) {
        try {
            return func.apply(arg1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public static Integer runItSafeBiFunction(BiFunction<Integer, Integer, Integer> func, Integer arg1, Integer arg2) {
        try {
            return func.apply(arg1, arg2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public static Integer runItSafeSupplier(Supplier<Integer> func) {
        try {
            return func.get();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public static void runItSafeConsumer(Consumer<Integer> func, Integer arg) {
        try {
            func.accept(arg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void runItSafeBiConsumer(BiConsumer<Integer, Integer> func, Integer arg1, Integer arg2) {
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

