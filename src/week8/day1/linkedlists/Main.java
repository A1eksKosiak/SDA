package week8.day1.linkedlists;

public class Main {
    public static void main(String[] args) {

        LinkedListFloat linkedListDouble = new LinkedListFloat();
        linkedListDouble.add(5.42f);
        linkedListDouble.add(3.18f);
        linkedListDouble.add(4.f);
        linkedListDouble.add(1.73f);
        linkedListDouble.add(-14.f);
        linkedListDouble.add(0.f);
        System.out.println(linkedListDouble.search(4.f));
        linkedListDouble.print();
        linkedListDouble.delete(3.18f);
        linkedListDouble.delete(4.f);
        linkedListDouble.delete(1.73f);
        linkedListDouble.search(4.f);
//        linkedListDouble.print();
    }
}
