package week8.day1;

public class GenericBinaryTree<T extends Number> {

    NodeBinaryTree<T> first;

    public void add(T element) {
        if (first == null) {
            first = new NodeBinaryTree<>(element);
            return;
        } else {
            first.add(element);
        }
    }

    public static void main(String[] args) {

        NodeBinaryTree<Integer> binaryTree = new NodeBinaryTree<>(new Integer("3"));
        binaryTree.add(new Integer("5"));
        binaryTree.add(new Integer("2"));
        binaryTree.add(new Integer("7"));
        binaryTree.add(new Integer("6"));
        binaryTree.add(new Integer("0"));
        binaryTree.add(new Integer("14"));
        binaryTree.print();

    }

}

class NodeBinaryTree<T extends Number> {

    T element;
    NodeBinaryTree<T> left;
    NodeBinaryTree<T> right;

    public NodeBinaryTree(T element) {
        this.element = element;
    }

    public void add(T element) {
        if (this.element.doubleValue() < element.doubleValue()) {
            if (right != null) {
                right.add(element);
            } else {
                right = new NodeBinaryTree<>(element);
            }
        } else {
            if (left != null) {
                left.add(element);
            } else {
                left = new NodeBinaryTree<>(element);
            }
        }


    }

    public void print() {
        System.out.println(element.toString());
        if (left != null) {
            left.print();
        }
        if (right != null) {
            right.print();
        }
    }
}