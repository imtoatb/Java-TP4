package Exo3;

public abstract class Commun {
    protected int[] elements;
    protected int count;
    protected static int instanceCount = 0;

    public Commun(int capacity) {
        this.elements = new int[capacity];
        this.count = 0;
        instanceCount++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    protected boolean isFull() {
        return count == elements.length;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(elements[i]);
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commun commun = (Commun) o;
        if (count != commun.count) return false;
        for (int i = 0; i < count; i++) {
            if (elements[i] != commun.elements[i]) {
                return false;
            }
        }
        return true;
    }
}