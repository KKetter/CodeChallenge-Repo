package DSA.JAVA.stacksandqueues;

public class Node<T> {
        public T value;
        public Node next;

        public Node(T value){
            this.value = value;
            this.next = null;
        }
    public String toString(){
        return String.format("[%s]", this.value.toString());
    }


}