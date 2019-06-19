package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
    public Node<T> root;
    public BinaryTree() {
        this.root = null;
    }

    public List<T> preOrder(Node input){
        if (input == null){
            return null;
        } else {
            List<T> values = new ArrayList<>();
            this.preOrderHelper(input, values);
            return values;
        }
    }

    protected void preOrderHelper(Node<T> node, List<T> values){
        values.add(node.value);
        if(node.leftChild != null) {
            this.preOrderHelper(node.leftChild, values);
        } if (node.rightChild != null){
            this.preOrderHelper(node.rightChild, values);
        }
    }

    public List<T> inOrder(Node input){
        if (input == null){
            return null;
        } else {
            List<T> values = new ArrayList<>();
            this.inOrderHelper(input, values);
            return values;
        }
    }

    protected void inOrderHelper(Node<T> node, List<T> values){
        if(node.leftChild != null) {
            this.inOrderHelper(node.leftChild, values);
        } values.add(node.value);
        if (node.rightChild != null){
            this.inOrderHelper(node.rightChild, values);
        }
    }

    public List<T> postOrder(Node input){
        if (input == null){
            return null;
        } else {
            List<T> values = new ArrayList<>();
            this.postOrderHelper(input, values);
            return values;
        }
    }

    protected void postOrderHelper(Node<T> node, List<T> values){
        if(node.leftChild != null) {
            this.postOrderHelper(node.leftChild, values);
        } if (node.rightChild != null){
            this.postOrderHelper(node.rightChild, values);
        } values.add(node.value);
    }

    public String breadthFirst(Node<T> node) {
        Queue<Node> queue = new LinkedList<>();
        Node<T> potato;
        String output = "";
        if (node == null) {
            throw new IllegalArgumentException("tree is empty");
        }
        queue.add(node);
        while (!queue.isEmpty()) {
            potato = queue.remove();
            output += potato.value + "\n";
            if (potato.leftChild != null) queue.add(potato.leftChild);
            if (potato.rightChild != null) queue.add(potato.rightChild);
        }
        return output;
    }
}
