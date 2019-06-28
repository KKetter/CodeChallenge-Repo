package FizzBuzzTree;

import tree.BinaryTree;
import tree.Node;

public class FizzBuzzTree {

    public static BinaryTree<Node> fizzBuzzTree(BinaryTree<Node> tree) {
        if (tree.root == null) {
            return tree;
        }
        fizzbuzzHelper(tree.root);
        return tree;
    }

    private static Node fizzbuzzHelper(Node node) {
        if (node == null) {
            return null;
        } else {
            if ((int) node.value % 15 == 0) {
                node.value = "FizzBuzz";
            } else if ((int) node.value % 3 == 0) {
                node.value = "Fizz";
            } else if ((int) node.value % 5 == 0) {
                node.value = "Buzz";
            }
        }
        fizzbuzzHelper(node.leftChild);
        fizzbuzzHelper(node.rightChild);
        return node;
    }
}
