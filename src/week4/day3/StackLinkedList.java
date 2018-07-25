package week4.day3;

public class StackLinkedList {
    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println("Stack before implementation:");
        stack.print();
        System.out.println("==========================");
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(13);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("==========================");
        System.out.println("Stack after pop:");
        stack.print();
        System.out.println("==========================");
    }
}

class Stack {
    private Node first;

    public void pop() {
        if (first != null) {
            first = first.next;
        }
    }

    public void push(int value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = first;
            first = newNode;
        }
    }

    public void print() {
        if (first == null) {
            System.out.println("Stack is empty");
        }
        Node tempNode = first;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
