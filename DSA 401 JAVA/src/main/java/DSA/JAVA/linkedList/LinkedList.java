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
    public String print(){
        Node n = head;
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("LinkedList: " );
        while (n !=  null){
            nodeString.append(n.value);
            nodeString.append("->");
            n = n.next;
        }
        nodeString.append("null");
        System.out.println(nodeString.toString());
        return (nodeString.toString());
    }
    //append
    public void append(int newData){
        Node newNode = new Node(newData);
        if (head == null){
            head = new Node(newData);
        }
        newNode.next = null;
        Node last = head;
        while(last.next != null) last = last.next;
        last.next = newNode;
    }
    //insertBefore - refresher provided by John Winters on use of previous as second pointer
    public boolean insertBefore(int target, int newData){
        Node current = head;
        Node previous;
        // first item in the list
        if(current.value == target){
            this.insert(newData);
        }
        previous = current;
        current = current.next;
        while(current != null){
            if(current.value == target){
                Node newNode = new Node(newData);
                previous.next = newNode;
                newNode.next = current;
                //got target and returned it
                return true;
            }
            previous = current;
            current = current.next;
        }
        //got to the end no target so return false
        return false;
    }
    //insertAfter
    public boolean insertAfter(int target, int newData){
        Node current = head;
        while (current != null){
            if (current.value == target ){
                Node newNode = new Node(newData);
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
        }
        return false;
    }

    public int linkedListFromTheEnd(int value){
        int counter = 0;
        Node target = null;
        for (Node itr = this.head; itr != null; itr = itr.next) {
            if (counter == value) target = this.head;
            if (counter > value) target = target.next;
            counter++;
        }

        if (target == null) {
            System.out.println("The argument " + value + " is too large. The link only has " + counter + " nodes");
            throw new IllegalArgumentException();
        }
        return target.value;
    }

}
