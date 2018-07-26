package week4.day3;

import week4.day1.LinkedList;

public class StackFromLinkedListClass {
    public static void main(String[] args) {

        StackTest stackTest = new StackTest();
        System.out.println("Stack before implementation:");
        stackTest.print();
        System.out.println("==========================");
        stackTest.push(7, 2, 9, 0);
        stackTest.print();
        stackTest.pop();
        System.out.println("==========================");
        System.out.println("Stack after pop:");
        stackTest.print();
        System.out.println("==========================");
    }
}

class StackTest {
    LinkedList linkedList;

    public void pop() {
        linkedList.deleteFirst();
    }

    public void push(int... value) {
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        for (int i = 0; i < value.length; i++) {
            linkedList.add(value[i]);
        }
    }

    public void print() {
        if (linkedList == null) {
            System.out.println("Stack is empty");
        } else {
            linkedList.print();
        }
    }
}