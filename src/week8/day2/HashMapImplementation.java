package week8.day2;

import java.util.*;

public class HashMapImplementation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), 1);
            } else {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }
        System.out.println(map);

        Map<Character, Integer> mapTwo = new HashMap<>();
        input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (!mapTwo.containsKey(input.charAt(i))) {
                mapTwo.put(input.charAt(i), 1);
            } else {
                mapTwo.put(input.charAt(i), mapTwo.get(input.charAt(i)) + 1);
            }
        }
        System.out.println(mapTwo);

        System.out.println(firstMapConsistsFromSecond(map, mapTwo));
    }

    static boolean firstMapConsistsFromSecond(Map<Character, Integer> first, Map<Character, Integer> second) {

        Set<Character> set = first.keySet();
//        for (Character ch: set) {
//            if (second.containsKey(ch)) {
//                if (first.get(ch) > second.get(ch)) {
//                    return false;
//                }
//            } else {
//                return false;
//            }
//        }
        for (Iterator<Character> it = set.iterator(); it.hasNext(); ) {
            Character ch = it.next();
            if (second.containsKey(ch)) {
                if (first.get(ch) > second.get(ch)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
