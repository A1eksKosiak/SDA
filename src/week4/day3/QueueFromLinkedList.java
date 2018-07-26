package week4.day3;

public class QueueFromLinkedList {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(1, 2, 7, 5, 13);
        queue.print();
        for (int i = 0; i < 6; i++) {
            queue.delete();
            System.out.println("Queue after deleting");
            queue.print();
        }
    }
}

class Queue {
    private LinkedList linkedList;

    public void add(int... value) {
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        for (int i = 0; i < value.length; i++) {
            linkedList.add(value[i]);
        }
    }

    public void delete() {
        if (linkedList == null || linkedList.first == null) {
            System.out.println("List is empty");
        } else {
            linkedList.delete();
        }
    }

    public void print() {
        linkedList.print();
    }
}

class LinkedList {

    NodeQueue first;
    NodeQueue last;

    public void add(int value) {
        if (first == null) {
            first = new NodeQueue(value);
            first.previous = first;
            last = first;
        } else {
            NodeQueue newNodeQueue = new NodeQueue(value);
            first.previous = newNodeQueue;
            newNodeQueue.next = first;
            first = newNodeQueue;
        }
    }

    public void delete() {
        if (last != null) {
            if (last.previous == null) {
                clearList();
            } else {
                last.previous.next = last.next;
                last = last.previous;
            }
        }
    }

    public void clearList() {
        first = null;
    }

    public boolean search(int value) {
        NodeQueue temporaryLink = first;
        while (temporaryLink != null) {
            if (temporaryLink.value == value) {
                return true;
            }
            temporaryLink = temporaryLink.next;
        }
        return false;
    }

    public void print() {
        NodeQueue temporaryLink = first;
        while (temporaryLink != null) {
            System.out.print("Current element is: " + temporaryLink.value);
            if (temporaryLink.next != null) {
                System.out.print("; previous: " + temporaryLink.next.value);
            }
            if (temporaryLink.previous != null) {
                System.out.print("; next: " + temporaryLink.previous.value);
            }
            System.out.println();

            temporaryLink = temporaryLink.next;
        }
    }

}

class NodeQueue {
    int value;
    NodeQueue next;
    NodeQueue previous;

    public NodeQueue(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}