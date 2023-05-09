package tdd;

public class CircularBuffer {

    private String[] buffer = new String[7];
    private int currentReadIndex = 0;
    private int currentWriteIndex = 0;
    private int maxSize = 7;

    public int getMaxSize() {
        return maxSize;
    }

    public int currentWriteIndex() {
        return currentWriteIndex;
    }

    public void add(String value) {

        if (currentWriteIndex == maxSize) {
            currentWriteIndex = 0;
        }

        buffer[currentWriteIndex] = value;
        currentWriteIndex += 1;

    }

    public String get() {
        if (currentReadIndex == maxSize) {
            currentReadIndex = 0;
        }

        return buffer[currentReadIndex++];
    }
}
