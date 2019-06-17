package DSA.JAVA.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
        Stack temp = new Stack();
        temp.push(4);
        assertEquals(4, temp.top.value);

    }

    @Test
    public void pop() {
        Stack temp = new Stack();
        temp.push(4);
        temp.push(5);
        temp.pop();
        assertEquals(4,temp.top.value);
    }

    @Test
    public void peek() {
        Stack temp = new Stack();
        temp.push(4);
        temp.push(5);
        assertEquals(5, temp.peek());
    }
}