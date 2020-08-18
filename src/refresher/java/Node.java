package refresher.java;

public class Node {
    private int value;
    private Node next;

    public Node(int v, Node nx) {
        this.value = v;
        this.next = nx;
    }

    public void setValue(int v){
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nx) {
        this.next = nx;
    }
}
