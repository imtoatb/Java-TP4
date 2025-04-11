package Exo3;

public class Queue extends Commun {
    public Queue(int capacity) {
        super(capacity);
    }

    public void add(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        elements[count++] = element;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int removedElement = elements[0];
        for (int i = 0; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
        return removedElement;
    }
}