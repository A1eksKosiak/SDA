package week8.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringToSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Character[] charObjectArray = input.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Set<Character> set = new HashSet<>(Arrays.asList(charObjectArray));
        System.out.println(set.size());
    }
}
