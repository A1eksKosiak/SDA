package week8.day4;

import java.util.concurrent.atomic.AtomicInteger;

public class GetMaxOfArrayWithThreads {
    public static void main(String[] args) throws InterruptedException {

        int size = 10000;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1_000_000_000);
        }
        int[] arrayFirstHalf = new int[array.length / 2];
        int[] arraySecondHalf = new int[array.length / 2];

        System.arraycopy(array, 0, arrayFirstHalf, 0, arrayFirstHalf.length);
        System.arraycopy(array, arrayFirstHalf.length, arraySecondHalf, 0, arraySecondHalf.length);

        AtomicInteger res1 = new AtomicInteger();
        AtomicInteger res2 = new AtomicInteger();

        Thread thread1 = new Thread(() -> res1.set(maxElement(arrayFirstHalf)));
        Thread thread2 = new Thread(() -> res2.set(maxElement(arraySecondHalf)));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Max from first half: " + res1.get());
        System.out.println("Max from first half: " + res2.get());
        System.out.println("Max element: " + ((res1.get() > res2.get()) ? res1.get() : res2.get()));
    }

    public static int maxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
