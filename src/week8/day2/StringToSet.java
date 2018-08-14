package week8.day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringToSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Set<Character> set = new HashSet<>();
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set.size());
    }
}
