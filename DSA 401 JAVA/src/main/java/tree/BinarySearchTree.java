package tree;

public class BinarySearchTree extends BinaryTree {
    public BinarySearchTree() {
        //invokes parent class constructor
        super();
    }
    //referenced https://www.baeldung.com/java-binary-tree
    public void add(Integer value) {
        if (this.root == null) {
            this.root = new Node(value, null, null);
        }
        addHelper(this.root, value);
    }

    protected Node addHelper(Node<Integer> node, Integer value){
        if (node == null) {
            return new Node(value, null, null);
        }

        if (value < node.value) {
            node.leftChild = addHelper(node.leftChild, value);
        } else if (value > node.value) {
            node.rightChild = addHelper(node.rightChild, value);
        } else {
            return node;
        }
        return node;
    }

    public boolean contains(Integer value){
        return containsHelper(this.root, value);
    }

    protected boolean containsHelper(Node<Integer> node, Integer value){
        if(node == null){
            return false;
        } if (node.value.equals(value)){
            return true;
        }
        return value < node.value ? containsHelper(node.leftChild, value) : containsHelper(node.rightChild, value);
    }
}
