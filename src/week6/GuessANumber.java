package week6;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 10000);
//        System.out.println("My number is " + random);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Input your number");
            int number = scanner.nextInt();
            if (random == number) {
                System.out.println("Your the champion!");
                return;
            } else if (random > number) {
                System.out.println("No luck, your number " + number + " is less, try again. You have " + (7 - i) + " attempts");
            } else {
                System.out.println("No luck, your number " + number + " is greater, try again. You have " + (7 - i) + " attempts");
            }
        }
    }
}