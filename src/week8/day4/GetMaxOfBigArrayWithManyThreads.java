package week8.day4;

import java.util.Random;

public class GetMaxOfBigArrayWithManyThreads {
    public static void main(String[] args) {
        int size = 30000;
        Integer[] array = new Integer[size];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(1_000_000_000));
        }

        int sizeOfSubList = 1000;
        int[] res = new int[size / sizeOfSubList];
        for (int i = 0; i < (size / sizeOfSubList); i++) {
            ThreadGetMax thread = new ThreadGetMax(array, sizeOfSubList * i, sizeOfSubList * (i + 1));
            thread.run();
            res[i] = thread.getMax(array, sizeOfSubList * i, sizeOfSubList * (i + 1));
        }
        int max = res[0];
        for (int i = 0; i < res.length; i++) {
            System.out.println("Res[" + i + "] = " + res[i]);
            if (res[i] > max) {
                max = res[i];
            }
        }
        System.out.println("Max = " + max);
    }
}

class ThreadGetMax implements Runnable {
    Integer[] array;
    int startElement;
    int endElement;

    public ThreadGetMax(Integer[] array, int startElement, int endElement) {
        this.array = array;
        this.startElement = startElement;
        this.endElement = endElement;
    }

    public int getMax(Integer[] array, int startElement, int endElement) {
        int max = startElement;
        for (int i = startElement; i < endElement; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public void run() {
        getMax(array, startElement, endElement);
    }
}