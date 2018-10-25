package deqo.fcaz.mysimplestack;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void isEmpty() {
        Stack s = new Stack();
        assertEquals(s.getSize(),0);
        s = new Stack();
        s.push(5);
        assertNotEquals(s.getSize(),0);

    }

    @Test
    public void getSize() {
        Stack s = new Stack();
        assertEquals(s.getSize(),0);
        s = new Stack();
        s.push(5);
        assertEquals(s.getSize(),1);
    }

    @Test
    public void push() {
        Stack s = new Stack();
        s.push(3);
        assertEquals(s.peek(),3);
    }

    @Test
    public void peek() {
        Stack s = new Stack();
        s.push(3);
        s.push(5);
        s.push(8);
        s.push(6);
        assertEquals(s.peek(),6);
        Stack d = new Stack();
        d.push(2);
        d.peek();
        assertFalse(d.isEmpty());
        assertEquals(d.peek(),d.pop());
    }

    @Test
    public void pop() {
        Stack s = new Stack();
        s.push(3);
        assertEquals(s.pop(),3);
        assertTrue(s.isEmpty());
        s.push(3);
        s.push(5);
        s.pop();
        assertFalse(s.isEmpty());
        s.pop();
        assertEquals(s.pop(),-1);
    }
}