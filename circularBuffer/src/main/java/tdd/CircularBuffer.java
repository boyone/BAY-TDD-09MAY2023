package tdd;


public class CircularBuffer {
    private int size = 0;
    private int maxSize;

    public CircularBuffer(int i) {
        maxSize = i;
    }

    public CircularBuffer() {
        maxSize = 10;
    }


    public int size() {
        return size;
    }

    public void add(String value) {
        if (size < maxSize) {
            size++;
        }
    }


}
