package tree;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static tree.BinaryTree.findMaxValue;

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
        BinaryTree test = new BinaryTree();
        test.root = new Node(40, null, null);
        test.root.leftChild = new Node(30, null, null);
        test.root.rightChild = new Node(50, null, null);
        test.root.leftChild.leftChild = new Node(20, null, null);
        test.root.leftChild.rightChild = new Node(35, null, null);
        test.root.rightChild.leftChild = new Node (40, null, null);
        List testResults = test.inOrder(test.root);
        List<Integer> testList = new ArrayList<>();
        testList.add(20);
        testList.add(30);
        testList.add(35);
        testList.add(40);
        testList.add(40);
        testList.add(50);
        assertEquals(testList, testResults);
        System.out.println(testList);
        System.out.println(testResults);
    }

    @Test
    public void postOrder() {
        BinaryTree test = new BinaryTree();
        test.root = new Node(40, null, null);
        test.root.leftChild = new Node(30, null, null);
        test.root.rightChild = new Node(50, null, null);
        test.root.leftChild.leftChild = new Node(20, null, null);
        test.root.leftChild.rightChild = new Node(35, null, null);
        test.root.rightChild.leftChild = new Node (40, null, null);
        List testResults = test.postOrder(test.root);
        List<Integer> testList = new ArrayList<>();
        testList.add(20);
        testList.add(35);
        testList.add(30);
        testList.add(40);
        testList.add(50);
        testList.add(40);
        assertEquals(testList, testResults);
        System.out.println(testList);
        System.out.println(testResults);

    }

    @Test
    public void breadthFirstTest() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new Node("a", null, null);
        testTree.root.leftChild = new Node("b", null, null);
        testTree.root.rightChild = new Node("c", null, null);
        testTree.root.leftChild.leftChild = new Node("d", null, null);
        testTree.root.leftChild.rightChild = new Node("e", null, null);
        testTree.root.rightChild.leftChild = new Node("f", null, null);
        assertEquals("output should match expected", "a\nb\nc\nd\ne\nf\n", testTree.breadthFirst(testTree.root));
    }

    @Test
    public void findMaxValueTest() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new Node(4,
                new Node(3,
                        new Node(50, null, null),
                        new Node(11, null, null)),
                new Node(5,
                        new Node(30, null, null),
                        new Node(20, null, null)));
        assertEquals("findMaxValue returns max value from tree", 50, findMaxValue(maxTree));
    }

    @Test
    public void findMaxValueZeroNegativesTest() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new Node(-4,
                new Node(-3,
                        new Node(-50, null, null),
                        new Node(-11, null, null)),
                new Node(-5,
                        new Node(-30, null, null),
                        new Node(0, null, null)));
        assertEquals("findMaxValue returns max value from tree", 0, findMaxValue(maxTree));
    }
}