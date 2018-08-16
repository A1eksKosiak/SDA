package week8.day3;

import java.util.Arrays;
import java.util.List;

public class StreamingImplementation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 2, 6, 5, 9, 2, -1, 0, 15, 47, 58, 16, 10);

        //steam implementation
        list.stream()
                .filter(element -> element > 2)
                .map(element -> element + 10)
                .forEach(System.out::println);
        System.out.println("---------------------");

        //identify all even elements, divide by 2 and print
        list.stream()
                .filter(element -> (element % 2 == 0))
                .map(element -> element / 2)
                .forEach(System.out::println);
        System.out.println("---------------------");

        //identify all even elements, add 1, filter all > 10, divide by 2, print
        list.stream()
                .filter(element -> (element % 2 == 0))
                .map(element -> element + 1)
                .filter(element -> (element > 10))
                .map(element -> element / 2)
                .forEach(System.out::println);
        System.out.println("---------------------");

//        //For each implementation
//        for (Integer number : list) {
//            if (number > 2) {
//                System.out.println(number);
//            }
//        }
    }
}
