package week3.day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        useQueue();
//        useStack();
        comparingStacks();
    }

    public static void comparingStacks() {
        // create 2 stacks with random data
        // compare if stacks are the same
        // *hint get last symbol from each stack and compare
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first stack");
        String firstInput = scanner.nextLine();
        Stack stackOne = new Stack(firstInput.length());
        for (int i = 0; i < firstInput.length(); i++) {
            stackOne.push(firstInput.charAt(i));
        }
        stackOne.printStack();

        System.out.println("Input second stack");
        String secondInput = scanner.nextLine();
        Stack stackTwo = new Stack(secondInput.length());
        for (int i = 0; i < secondInput.length(); i++) {
            stackTwo.push(secondInput.charAt(i));
        }
        stackTwo.printStack();

        if (firstInput.length() == secondInput.length()) {

            for (int i = 0; i < firstInput.length(); i++) {
                if (stackOne.pop() != stackTwo.pop()) {
                    System.out.println("Stacks are not same elements in index " + (firstInput.length() - i) + " are different");
                    return;
                }
            }
            System.out.println("Stacks are the same");
        } else {
            System.out.println("Stacks are not same (different length)");
        }


    }

    public static void useQueue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of the array");
        int input = scanner.nextInt();

        Queue queue = new Queue(input);
        System.out.println("Initial array");
        queue.printQueue();
        for (int i = 0; i < input * 2 + 1; i++) {
            if (i >= input) {
                System.out.println("Removing " + queue.dequeue());
            }
            queue.enqueue((int) (Math.random() * 10));
        }
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