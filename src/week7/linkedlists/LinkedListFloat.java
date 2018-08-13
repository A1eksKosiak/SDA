package week7.linkedlists;

public class LinkedListFloat {

    NodeFloat first;

    public void add(Float value) {
        if (first == null) {
            first = new NodeFloat(value);
        } else {
            NodeFloat newNode = new NodeFloat(value);
            newNode.previous = first;
            newNode.next = first;
            first = newNode;
        }
    }

    public void delete(Float value) {

    }

    public boolean search(Float value) {
        NodeFloat tempNode = first;
        while (tempNode != null) {
            if (tempNode.value.equals(value)){
                return true;
            }
            tempNode = tempNode.next;
        }

        return false;
    }

    public void print() {
        NodeFloat tempNode = first;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }
    }

}

class NodeFloat {
    Float value;
    NodeFloat next;
    NodeFloat previous;

    public NodeFloat(Float value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
