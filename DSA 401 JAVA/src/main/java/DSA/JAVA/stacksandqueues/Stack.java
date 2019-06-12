package DSA.JAVA.stacksandqueues;

import org.apache.commons.math3.stat.descriptive.rank.Max;

import java.util.EmptyStackException;

public class Stack<T> {
//    Create a Stack class that has a top property.
   public Node<T> top;
   public Stack(){
        this.top = null;
    }
//    Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
   public void push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.next = this.top;
        this.top = newNode;
    }
//    Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    public T pop(){
        if(top == null) throw new EmptyStackException();
        Node<T> temp = this.top;
        this.top = temp.next;
        return temp.value;
    }
//    Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
    public T peek(){
        if(top == null) throw new EmptyStackException();
        return this.top.value;
    }
    public boolean isEmpty(){
        return top == null ? true : false;
    }
}
