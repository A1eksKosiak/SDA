package week3.day2;

public class Queue {

    private int head;
    private int tail;
    private int[] array;

    public Queue(int size) {
        this.head = 1;
        this.tail = 1;
        this.array = new int[size];
    }

    public boolean enqueue(int element) {
        for (int i = 0; i < array.length; i++) {
            if (tail + 1 == head) {
                return false;
            }
            array[tail] = element;
            tail++;
            if (tail == array.length) {
                tail = 0;
            }
        }
        return true;
    }

    public void dequeue() {



    }

}
