package Exo3;

public class Stack extends Commun {
    public Stack(int capacity) {
        super(capacity);
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        elements[count++] = element;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return elements[--count];
    }
}