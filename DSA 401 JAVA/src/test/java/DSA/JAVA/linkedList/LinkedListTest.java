package DSA.JAVA.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    //2. Can properly insert into the linked list
    //3. The head property will properly point to the first node in the linked list
    @Test
    public void insert(){
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(5);
        list.insert(6);
        //this value should be head!
        list.insert(7);
        //assertTrue/Equals that head.value = 7
        assertTrue("Checks last inserted value is stored as the head", list.head.value == 7);

    }
    //1. Can successfully instantiate an empty linked list
    //6. Will return false when searching for a value in the linked list that does not exist
    @Test
    public void doesNotInclude() {
        LinkedList list = new LinkedList();
        assertFalse(list.includes(14));
    }
    //2.
    //4. Can properly insert multiple nodes in the Linked List
    //5. Will return true when finding a value within the linked list that exists
    //6.
    @Test
    public void includes() {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        assertTrue(list.includes(4));
        assertFalse(list.includes(14));
    }
    //2.
    //4.
    //7. Can properly return a collection of all the values that exist in the linked list
    @Test
    public void print() {
        LinkedList list = new LinkedList();
        list.insert(444);
        list.insert(555);
        list.insert(666);
        list.insert(777);

        assertEquals("LinkedList: 777->666->555->444->null", list.print());
    }
}