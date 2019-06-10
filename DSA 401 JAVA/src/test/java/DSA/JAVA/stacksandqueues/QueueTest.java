package DSA.JAVA.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void insertNewNodeToEmptyList() {
        Queue temp = new Queue();
        temp.enqueue(5);
        assertEquals(5, temp.front.value);
        assertEquals(temp.front.value, temp.rear.value);
    }

    @Test
    public void dequeue() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();

        assertEquals(6, queue.front.value);
    }

    @Test
    public void peek() {
        Queue temp = new Queue();
        temp.enqueue(5);
        assertEquals(5, temp.peek());
    }
}