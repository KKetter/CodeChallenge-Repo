package DSA.JAVA.queueWithStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueueTest() {
        PseudoQueue temp = new PseudoQueue();
        temp.enqueue(4);
        assertEquals(4, temp.enqueueStack.top.value);
        temp.dequeue();
        temp.enqueue(5);
        temp.enqueue(6);
        assertEquals(6, temp.enqueueStack.top.value);

    }

    @Test
    public void dequeueTest() {
        PseudoQueue temp = new PseudoQueue();
        temp.enqueue(4);
        temp.enqueue(5);
        assertEquals(4, temp.dequeue());
        temp.enqueue(6);
        temp.enqueue(7);
        assertEquals(5, temp.dequeue());
        assertEquals(6, temp.dequeue());
        assertEquals(7, temp.dequeue());

    }
}