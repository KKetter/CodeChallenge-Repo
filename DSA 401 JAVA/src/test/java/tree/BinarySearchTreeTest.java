package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void addTest() {
        BinarySearchTree testyTree = new BinarySearchTree();
        assertTrue(null, testyTree.root == null);
        testyTree.add(400);
        testyTree.add(100);
        testyTree.add(50);
        testyTree.add(125);
        assertTrue("first value input was 400", (int) testyTree.root.value == 400);

    }

    @Test
    public void contains() {
        BinarySearchTree testyTestTree = new BinarySearchTree();
        testyTestTree.add(400);
        testyTestTree.add(100);
        testyTestTree.add(50);
        testyTestTree.add(125);
        assertFalse("does not contain 33", (boolean) testyTestTree.contains(33) == true);
        assertTrue("does contain 100", (boolean) testyTestTree.contains(100) == true);
    }
}