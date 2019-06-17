package DSA.JAVA.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T>{
        Node<T> front;
        Node<T> rear;

//    Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if(rear == null && front == null){
            this.front = newNode;
            this.rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

//    Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    public T dequeue(){
        if(front == null) throw new NoSuchElementException();
        Node<T> temp = front;
        front = temp.next;
        if(front == null) rear = null;
        return temp.value;
    }
//    Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
    public T peek(){
        return this.front.value;
    }
}
