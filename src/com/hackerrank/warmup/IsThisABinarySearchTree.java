package com.hackerrank.warmup;

public class IsThisABinarySearchTree {
    /* Hidden stub code will pass a root argument to the function below.
    Complete the function to solve the challenge.
    Hint: you may want to write one or more helper functions.
     */
    public static void main(String[] args) {

        Node node = new Node(100);
        node.left = new Node(50);
        node.right = new Node(200);

        node.left.left = new Node(30);
        node.left.right = new Node(80);

        node.left.left.left = new Node(10);
        node.left.left.right = new Node(40);
        node.left.right.left = new Node(70);
        node.left.right.right = new Node(90);

        node.right.left = new Node(150);
        node.right.right = new Node(250);

        node.right.left.left = new Node(120);
        node.right.left.right = new Node(170);
        node.right.right.left = new Node(270);
        node.right.right.right = new Node(300);

        IsThisABinarySearchTree main = new IsThisABinarySearchTree();

        System.out.println(main.checkBST(node));
    }

    boolean checkBST(Node root) {
        return doCheckBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean doCheckBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data < min || node.data > max) {
            return false;
        }

        return doCheckBST(node.left, min, node.data - 1)
                && doCheckBST(node.right, node.data + 1, max);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
