package deqo.fcaz.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack implements SimpleStack{

    private int size;
    private ArrayList<Integer> pile;

    public Stack() {
        this.size = 0;
        this.pile = new ArrayList<Integer>(size);
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push(int val) {
        this.size += 1;
        this.pile.add(val);
    }

    public int peek() throws EmptyStackException {
        return pile.get(this.size-1);
    }

    public int pop() throws EmptyStackException {
        if(this.size != 0) {
            int tete = pile.get(size - 1);
            this.pile.remove(size - 1);
            this.size -= 1;
            return tete;
        }
        else{
            return -1;
        }
    }
}
