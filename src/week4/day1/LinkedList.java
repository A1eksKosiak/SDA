package week4.day1;

public class LinkedList {

    Node first;

    public void add(int value) {
        if (first == null) {
            first = new Node(value);
            first.previous = first;
        } else {
            Node newNode = new Node(value);
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
        }
    }

    public void deleteElement(Node element) {
        element = element.next;
        element.previous = element.previous.previous;
    }

    public void deleteFirst() {
        if (first != null) {
            first = first.next;
            first.previous = first.previous.previous;
        }
    }

    public void delete(int value) {
        Node temporaryLink = first;
        Node previousLink = first;
        while (temporaryLink.value != value) {
            if (temporaryLink.next == null) {
                break;
            }
            previousLink = temporaryLink;
            temporaryLink = temporaryLink.next;
        }
        if (temporaryLink.value == value) {
            if (temporaryLink == first) {
                first = first.next;
                delete(value);
            } else {
                previousLink.next = temporaryLink.next;
                delete(value);
            }
        } else {
            System.out.println("Not found");
        }
    }

    public boolean search(int value) {
        Node temporaryLink = first;
        while (temporaryLink != null) {
            if (temporaryLink.value == value) {
                return true;
            }
            temporaryLink = temporaryLink.next;
        }
        return false;
    }

    public void print() {
        Node temporaryLink = first;
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

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        System.out.println(list.search(5));
        list.delete(2);
        list.print();
    }
}

class Node {
    int value;
    Node next;
    Node previous;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}

class NodeTest {
    private int value;
    NodeTest next;

//    public static void main(String[] args) {
//        NodeTest list = new NodeTest(1);
//        list = list.add(0);
//        list = list.add(26);
//        list = list.add(17);
//        list.printWholeList();
//
//        int el = 17;
////        boolean exist = list.search(el);
////        System.out.println("Element " + el + " result: " + exist);
//
//        System.out.println("Deleting element: " + el);
////        list.next.delete(el, list, list.next.next);
////        list.delete(el, list, list.next.next);
////        System.out.println("Deleting first element");
////        list = list.deleteFirstElement();
//        list.deleteAnyElement(el, list);
//        list.printWholeList();
//    }

    public NodeTest(int value) {
        this.value = value;
        this.next = null;
    }

    public NodeTest add(int value) {
        //creates new NodeTest
        NodeTest newFirstNode = new NodeTest(value);
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

    public NodeTest deleteFirstElement() {
        return next;
    }

    static void deleteAnyElement(int element, NodeTest list) {
        if (list.value == element) {
            list = list.deleteFirstElement();
            return;
        }
        list.next.delete(element, list);
    }

    public void delete(int element, NodeTest previous) {
        if (this.value == element) {
            previous.next = this.next;
        } else {
            this.next.delete(element, previous.next);
        }
    }

    public void printWholeList() {
        System.out.println(value);
        if (next != null) {
            next.printWholeList();
        }
    }
}