package tdd;


import java.util.ArrayList;
import java.util.List;

public class CircularBuffer {
    private int size = 0;
    private int maxSize;
    private List<String> list=new ArrayList<>();

    public CircularBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public CircularBuffer() {
        maxSize = 10;
    }

    public int size() {
        return size;
    }

    public void add(String value) {
        list.add(value);
        if (size < maxSize) {
            size++;
        }
    }

    public String get() {
        return list.get(0);
    }
}
