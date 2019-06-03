package DSA.JAVA.linkedList;
//Reference: https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/
public class LinkedList {
    //head - this is in the node.java class- do i need to "bring this in?"
    Node head;
    //insert
    public void insert(int newData){
        //create new node and insert data
        Node newNode = new Node(newData);
        //make new node at head
        newNode.next = head;
        //move head to point to new node
        head = newNode;
    }
    //includes
    public boolean includes(int target){
        Node current = head;
        while (current != null){
            if (current.value == target )return true;
            current = current.next;
        }
        return false;
    }
    //print
    public void print(){
        Node n = head;
        while (n !=  null){
            System.out.print(n.value + " ");
            n = n.next;
        }
    }
}
