package tree;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void preOrder() {
        BinaryTree test = new BinaryTree();
        test.root = new Node(40, null, null);
        test.root.leftChild = new Node(30, null, null);
        test.root.rightChild = new Node(50, null, null);
        test.root.leftChild.leftChild = new Node(20, null, null);
        test.root.leftChild.rightChild = new Node(35, null, null);
        test.root.rightChild.leftChild = new Node (40, null, null);
        List testResults = test.preOrder(test.root);
        List<Integer> testList = new ArrayList<>();
        testList.add(40);
        testList.add(30);
        testList.add(20);
        testList.add(35);
        testList.add(50);
        testList.add(40);
        assertEquals(testList, testResults);
        System.out.println(testList);
        System.out.println(testResults);
    }

    @Test
    public void inOrder() {
    }

    @Test
    public void postOrder() {
    }
}