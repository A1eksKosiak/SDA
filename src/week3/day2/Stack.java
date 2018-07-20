package week3.day2;

import java.util.Arrays;

public class Stack {

    private int top;
    private Character[] array;

    public Stack(int size) {
        top = 0;
        array = new Character[size];
    }

    public void printStack() {
        System.out.println(Arrays.toString(array));
    }

    public boolean push(Character element) {
        if (array.length == top) {
            return false;
        }
        array[top] = element;
        top++;
        return true;
    }

    public Character pop() {
        if (top != 0) {
            top--;
            return array[top];
        }
        return null;
    }
}
