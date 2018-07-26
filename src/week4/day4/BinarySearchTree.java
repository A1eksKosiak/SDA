package week4.day4;

public class BinarySearchTree {
    Node root;

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(5);
        binarySearchTree.add(3);
        binarySearchTree.add(7);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.print();
        binarySearchTree.search(2);

    }

    public void add(int value) {
        if (root == null) {
            Node node = new Node(value);
            root = node;
        } else {
            root.add(value);
        }
    }

    public void print() {
        root.print();
    }

    public void search(int element) {
        System.out.println(root.search(element));
    }

}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public boolean search(int element) {
        if (value != element) {
            if (value > element) {
                if (left != null) {
                    return left.search(element);
                }else return false;
            } else {
                if (right != null) {
                    return right.search(element);
                }else return false;
            }
        }
        return true;
    }

    public void add(int element) {
        if (element > value) {
            if (right != null) {
                right.add(element);
            } else {
                right = new Node(element);
            }
        } else {
            if (left != null) {
                left.add(element);
            } else {
                left = new Node(element);
            }
        }
    }

    public void print() {
        System.out.println(value);
        if (left != null) {
            left.print();
        }
        if (right != null) {
            right.print();
        }
    }

}