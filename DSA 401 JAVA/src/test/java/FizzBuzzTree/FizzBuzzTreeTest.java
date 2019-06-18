package FizzBuzzTree;

import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test
    public void testFizzBuzzTree() {
        BinaryTree testBT = new BinaryTree();
        testBT.root = new Node(50,null,null);
        testBT.root.leftChild = new Node(5,null,null);
        testBT.root.rightChild = new Node(3,null,null);
        testBT.root.leftChild.leftChild = new Node(4,null,null);
        testBT.root.leftChild.rightChild = new Node(14,null,null);
        testBT.root.rightChild.leftChild = new Node(5,null,null);
        testBT.root.rightChild.rightChild = new Node(30,null,null);
        //    50
        //  5    3
        // 4 14 5 30

        //   B
        // B    F
        //4 14 B FB

        List<Object> testAfter = new ArrayList<>();
        testAfter.add("Buzz");
        testAfter.add("Buzz");
        testAfter.add(4);
        testAfter.add(14);
        testAfter.add("Fizz");
        testAfter.add("Buzz");
        testAfter.add("FizzBuzz");
        //do the fizzing and buzzing
        FizzBuzzTree.fizzBuzzTree(testBT);
        ArrayList<Node> arrayWithNewValues = new ArrayList(testBT.preOrder(testBT.root));

        ArrayList after = new ArrayList<>();
        for (int i = 0; i < testAfter.size(); i ++) {
            after.add(arrayWithNewValues.get(i));
        }

        assertEquals(testAfter, arrayWithNewValues);

    }
}