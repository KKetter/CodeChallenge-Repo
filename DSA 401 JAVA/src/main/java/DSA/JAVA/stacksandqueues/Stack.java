package DSA.JAVA.stacksandqueues;

import org.apache.commons.math3.stat.descriptive.rank.Max;

public class Stack {
//    Create a Stack class that has a top property.
    public Node top;
//    It creates an empty Stack when instantiated.
//    This object should be aware of a default empty value assigned to top when the stack is created.
    public Stack(){
        this.top = null;
    }
//    Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
   public void push(int value){
        Node node = new Node(value);
        node.next = this.top;
        this.top = node;

    }
//    Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    public Node pop(){
        Node temp = this.top;
        this.top = top.next;
        temp.next = null;
        return temp;
    }
//    Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
    public int peek(){
        return this.top.value;
    }

}
