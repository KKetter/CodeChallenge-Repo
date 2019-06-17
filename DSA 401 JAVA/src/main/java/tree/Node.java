package tree;

public class Node<T> {
    public T value;
    public Node leftChild;
    public Node rightChild;


    public Node(T value, Node leftChild, Node rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;


    }
    public String toString(){
        return String.format("%s", this.value.toString());
    }
}
