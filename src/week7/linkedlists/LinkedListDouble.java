package week7.linkedlists;

public class LinkedListDouble {

    private NodeDouble first;

    public void add(Double value) {
        if (first == null) {
            first = new NodeDouble(value);
            first.previous = first;
            first.next = null;
        } else {
            NodeDouble newNode = new NodeDouble(value);
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
        }
    }

    public void delete(Double value) {
        NodeDouble tempLink = first;
        NodeDouble previousLink = first;
        while (!tempLink.value.equals(value)) {
            if (tempLink.next == null) {
                break;
            }
            previousLink = tempLink;
            tempLink = tempLink.next;
        }
        if (tempLink.value.equals(value)) {
            if (tempLink == first) {
                first = first.next;
                delete(value);
            } else {
                previousLink.next = tempLink.next;
                delete(value);
            }
        }
    }

    public boolean search(Double value) {
        NodeDouble tempNode = first;
        while (tempNode.next != null) {
            if (tempNode.value.equals(value)) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }


    public void print() {
        NodeDouble tempNode = first;
        while (tempNode != null) {
            System.out.println(tempNode.value.toString());
            tempNode = tempNode.next;
        }
        System.out.println("-----------------------------");
    }
}

class NodeDouble {

    Double value;
    NodeDouble next;
    NodeDouble previous;

    public NodeDouble(Double value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}