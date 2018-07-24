package week4.day1;

public class LinkedList {
    public static void main(String[] args) {
        Node list = new Node(1);
//        list = list.add(6);
//        list = list.add(12);
//        list = list.add(4);
        list = list.add(0);
        list = list.add(26);
        list = list.add(17);
        list.printWholeList();

        int el = 26;
//        boolean exist = list.search(el);
//        System.out.println("Element " + el + " result: " + exist);

        System.out.println("Deleting element: " + el);
        list.next.delete(el, list, list.next.next);
//        list.delete(el, list, list.next.next);
        list.printWholeList();
    }
}

class Node {
    private int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node add(int value) {
        //creates new Node
        Node newFirstNode = new Node(value);
        //Link new node to current node
        newFirstNode.next = this;
        //returning new first node
        return newFirstNode;
    }

    public boolean search(int value) {
        if (this.value == value) {
            return true;
        } else if (next != null) {
            return next.search(value);
        }
        return false;
    }

    public void delete(int element, Node previous, Node nextNode) {
        if (this.value == element) {
            previous.next = nextNode;
        } else {
            nextNode.delete(element,previous.next, nextNode.next);
        }
    }

    public void printWholeList() {
        System.out.println(value);
        if (next != null) {
            next.printWholeList();
        }
    }
}