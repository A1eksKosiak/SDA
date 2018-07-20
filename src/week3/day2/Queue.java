package week3.day2;

import java.util.Arrays;

public class Queue {

    private int head;
    private int tail;
    private int[] array;
    private int counter;

    public Queue(int size) {
        this.array = new int[size];
        head = 1;
        tail = 1;
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    public void printQueue() {
//        System.out.println("Queue: ");
        System.out.println(Arrays.toString(array));
    }

    public boolean enqueue(int element) {
        if (counter == array.length) {
            return false;
        }
        array[tail] = element;
        tail++;
        counter++;
        if (tail == array.length) {
            tail = 0;
        }
        printQueue();
        return true;
    }

    public int dequeue() {
        if (counter == 0) {
            return -1;
        }
        head++;
        counter--;
        if (head == array.length) {
            head = 0;
        }
        return array[head];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(7);
        queue.enqueue(5);
        queue.enqueue(13);
        queue.enqueue(45);
        queue.enqueue(67);
        queue.dequeue();
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(40);
    }
}
