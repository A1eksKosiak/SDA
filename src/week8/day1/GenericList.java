package week8.day1;

public class GenericList<T> {

    Node<T> first;

    public GenericList(T element) {
        this.first = new Node<>(element);
    }

    public void add(T element) {
        Node<T> current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<T>(element);
    }

    public void print() {
        Node<T> current = first;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        GenericList<Integer> genericList = new GenericList<>(2);
        genericList.add(4);
        genericList.add(1);
        genericList.add(7);
        genericList.add(5);
        genericList.print();
    }
}

class Node<T> {
    T element;
    Node next;

    public Node(T element) {
        this.element = element;
    }
}