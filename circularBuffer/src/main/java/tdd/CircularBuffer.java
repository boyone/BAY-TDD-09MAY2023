package tdd;

public class CircularBuffer {

    private int size = 0;

    public int size() {
        return size;
    }

    public void add(String value) {
        size++;
    }
}
