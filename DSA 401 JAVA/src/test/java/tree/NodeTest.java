package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void toString1() {
        Node leftChild = new Node(3, null, null);
        Node rightChild = new Node(6, null, null);
        Node test = new Node(5,leftChild,rightChild);
        assertEquals("5", test.toString());

    }
}