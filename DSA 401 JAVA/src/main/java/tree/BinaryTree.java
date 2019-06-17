package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    public Node<T> root;
    public BinaryTree() {
        this.root = null;
    }

    public List<Integer> preOrder(Node input){
        if (input == null){
            return null;
        } else {
            List<Integer> values = new ArrayList<>();
            this.preOrderHelper(input, values);
            return values;
        }
    }

    protected void preOrderHelper(Node<Integer> node, List<Integer> values){
        values.add(node.value);
        if(node.leftChild != null) {
            this.preOrderHelper(node.leftChild, values);
        } if (node.rightChild != null){
            this.preOrderHelper(node.rightChild, values);
        }
    }

    public List<Integer> inOrder(Node input){
        if (input == null){
            return null;
        } else {
            List<Integer> values = new ArrayList<>();
            this.inOrderHelper(input, values);
            return values;
        }
    }

    protected void inOrderHelper(Node<Integer> node, List<Integer> values){
        if(node.leftChild != null) {
            this.inOrderHelper(node.leftChild, values);
        } values.add(node.value);
        if (node.rightChild != null){
            this.inOrderHelper(node.rightChild, values);
        }
    }

    public List<Integer> postOrder(Node input){
        if (input == null){
            return null;
        } else {
            List<Integer> values = new ArrayList<>();
            this.postOrderHelper(input, values);
            return values;
        }
    }

    protected void postOrderHelper(Node<Integer> node, List<Integer> values){
        if(node.leftChild != null) {
            this.postOrderHelper(node.leftChild, values);
        } if (node.rightChild != null){
            this.postOrderHelper(node.rightChild, values);
        } values.add(node.value);
    }
}
