package week8.day1;

public class GenericStack<K, V extends Number> {

    private int top;
    private Object[] array;

    public GenericStack() {
        array = new Object[10];
        this.top = 0;
    }

    public void push(K key, V value) {
        array[top] = new NodeStack(key, value);
        top++;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        GenericStack<String, Integer> stack = new GenericStack();
        stack.push("aaa", new Integer("111"));
        stack.push("bbb", new Integer("222"));
        stack.push("ccc", new Integer("333"));
        stack.push("ddd", new Integer("444"));
        stack.print();
        stack.pop();
        stack.print();
    }

    private void pop() {
    }

}

class NodeStack<K, V extends Number> {
    private K key;
    private V value;

    public NodeStack(K key, V value) {
        this.key = key;
        this.value = value;
    }

}