package week8.day3;

import java.util.Arrays;
import java.util.List;

public class StreamingImplementation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 2, 6, 5, 9, 2, -1, 0);

        for (Integer number : list){
            if (number > 2){
                System.out.println(number);
            }
        }
    }
}
