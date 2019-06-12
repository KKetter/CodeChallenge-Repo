package DSA.JAVA.queueWithStacks;

import DSA.JAVA.stacksandqueues.Stack;

import java.util.EmptyStackException;

public class PseudoQueue<T> {
    Stack<T> enqueueStack;
    Stack<T> dequeueStack;

    public PseudoQueue(){
        this.enqueueStack = new Stack();
        this.dequeueStack = new Stack();
    }

    public void enqueue(T value){
        this.enqueueStack.push(value);
    }

    public T dequeue(){
        if(dequeueStack.isEmpty()){
            if(!enqueueStack.isEmpty()){
                stackToQueue();
            }else throw new EmptyStackException();
        }
        return dequeueStack.pop();
    }

    public boolean isEmpty(){
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    private void stackToQueue(){
        while(!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
    }



}
