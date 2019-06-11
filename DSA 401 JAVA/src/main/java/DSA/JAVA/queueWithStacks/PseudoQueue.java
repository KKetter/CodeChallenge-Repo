package DSA.JAVA.queueWithStacks;

import DSA.JAVA.stacksandqueues.Node;
import DSA.JAVA.stacksandqueues.Stack;

public class PseudoQueue {
    Stack enqueueStack;
    Stack dequeueStack;

    public PseudoQueue(){
        this.enqueueStack = new Stack();
        this.dequeueStack = new Stack();
    }

    public void enqueue(int value){
        this.enqueueStack.push(value);
    }

    public int dequeue(){
        while(enqueueStack.top != null){
            dequeueStack.push(enqueueStack.pop().value);
        }
        Node temp = dequeueStack.pop();

        while(dequeueStack.top != null){
            enqueueStack.push(dequeueStack.pop().value);
        }
        return temp.value;
    }



}
