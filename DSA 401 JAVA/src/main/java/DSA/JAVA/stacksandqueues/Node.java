package DSA.JAVA.stacksandqueues;

public class Node {

    public int value;
    public Node next;

    Node(int data){
        value = data;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}