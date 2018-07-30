package week4.day5;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        Node[] nodes = new Node[]{
                new Node(5),
                new Node(3),
                new Node(1),
                new Node(2),
                new Node(7),
                new Node(6),
                new Node(0),
                new Node(-50),
                new Node(15),
                new Node(13),
                new Node(47)
        };
        mergeSort(nodes);
        //printing
        System.out.println(Arrays.toString(nodes));
    }

    static void mergeSort(Node[] list) {

        if (list.length <= 1) {
            return;
        }


        //divide array into 2 smaller
        Node[] first = new Node[list.length / 2];
        Node[] second = new Node[list.length - first.length];

        //copy data from array
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, list);

    }

    static void merge(Node[] first, Node[] second, Node[] result) {

        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].value < second[iSecond].value) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);

    }
}

class Node {
    public int value;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " " + value;
    }
}