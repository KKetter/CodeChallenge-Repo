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
    //Can successfully insert a node after the last node of the linked list
    //Can successfully add multiple nodes to the end of a linked list
    @Test
    public void append() {

        LinkedList list = new LinkedList();
        list.insert(444);
        list.insert(555);
        list.insert(666);
        list.insert(777);
        list.append(333);
        list.append(222);
        assertEquals("LinkedList: 777->666->555->444->333->222->null", list.print());
    }
    //Can successfully insert a node before the first node of a linked list
    //Can successfully insert a node before a node located in the middle of a linked list
    @Test
    public void insertBefore() {
        LinkedList list = new LinkedList();
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insertBefore(70, 80);
        assertEquals("LinkedList: 80->70->60->50->40->null", list.print());
        list.insertBefore(60, 65 );
        assertEquals("LinkedList: 80->70->65->60->50->40->null", list.print());
    }
    //Can successfully insert a node after the last node of the linked list
    //Can successfully add a node to the end of the linked list
    //Can successfully insert after a node in the middle of the linked list
    @Test
    public void insertAfter() {
        LinkedList list = new LinkedList();
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insertAfter(40, 30);
        assertEquals("LinkedList: 70->60->50->40->30->null", list.print());
        list.insertAfter(30, 20);
        list.insertAfter(20, 10);
        assertEquals(true , list.includes(10));
        list.insertAfter(40, 35);
        assertEquals("LinkedList: 70->60->50->40->35->30->20->10->null", list.print());
    }
    @Test
    public void linkedListFromTheEnd(){
        LinkedList list = new LinkedList();
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.linkedListFromTheEnd(2);
        assertEquals(60, list.linkedListFromTheEnd(2));
        assertEquals(40, list.linkedListFromTheEnd(0));

    }
    @Test(expected = IllegalArgumentException.class)
    public void linkedListFromTheEndFail(){
        LinkedList list = new LinkedList();
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.linkedListFromTheEnd(8);
        assertEquals("The argument 8 is too large. The link only has 4 nodes", list.linkedListFromTheEnd(8));

    }

    @Test
    public void testMergeLList() {
        LinkedList list = new LinkedList();
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        LinkedList list1 = new LinkedList();
        list1.insert(4);
        list1.insert(5);
        list1.insert(6);
        list1.insert(7);

        LinkedList output = LinkedList.mergeLists(list, list1);
        String expected = "LinkedList: 70->7->60->6->50->5->40->4->null";

        assertEquals(expected, output.print());
    }
}