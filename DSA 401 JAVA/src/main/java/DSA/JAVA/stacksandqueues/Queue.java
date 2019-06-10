package DSA.JAVA.stacksandqueues;

public class Queue {
    Node front;
    Node rear;
//    This object should be aware of a default empty value assigned to front when the queue is created.
    public Queue(){
        this.front = null;
        this.rear = null;
    }
//    Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    public void enqueue(int value){
        if (this.front == null) {//if the queue is empty
            this.front = new Node(value);
            this.rear = this.front;
        }else{
            Node prev = this.rear;
            this.rear = new Node(value);
            prev.next = this.rear;
        }

    }
//    Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    public Node dequeue(){
        Node temp = front;
        front = front.next;
        temp.next = null;
        return temp;
    }
//    Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
    public int peek(){
        return this.front.value;
    }
}
