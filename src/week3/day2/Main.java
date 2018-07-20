package week3.day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        useQueue();

//        useStack();
    }

    public static void useQueue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of the array");
        int input = scanner.nextInt();

        Queue queue = new Queue(input);


    }

    public static void useStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string");
        String input = scanner.nextLine();

        Stack stack = new Stack(input.length());

        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if (currentCharacter == '(') {
                stack.push(currentCharacter);
            } else {
                if (stack.pop() == null) {
                    System.out.println("ERROR");
                    return;
                }
            }
        }
        if (stack.pop() != null) {
            System.out.println("Error!!!");
        } else System.out.println("SUCCESS");
    }
}