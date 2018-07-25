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
    private NodeQueue first;

    public void pop() {
        if (first != null) {
            first = first.next;
        }
    }

    public void push(int value) {
        if (first == null) {
            first = new NodeQueue(value);
        } else {
            NodeQueue newNodeQueue = new NodeQueue(value);
            newNodeQueue.next = first;
            first = newNodeQueue;
        }
    }

    public void print() {
        if (first == null) {
            System.out.println();
            System.out.println("***Stack is empty***");
        }
        NodeQueue tempNodeQueue = first;
        while (tempNodeQueue != null) {
            System.out.println(tempNodeQueue.value);
            tempNodeQueue = tempNodeQueue.next;
        }
    }
}

class Node {
    int value;
    NodeQueue next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
