package tdd;

public class CircularBuffer {

    private String[] buffer = new String[7];
    private int currentReadIndex = 0;
    private int currentWriteIndex = 0;

    public int currentWriteIndex() {
        return currentWriteIndex;
    }

    public void add(String value) {

        if (currentWriteIndex == 7) {
            currentWriteIndex = 0;
        }

        buffer[currentWriteIndex] = value;
        currentWriteIndex += 1;

    }

    public String get() {
        if (currentReadIndex == 7) {
            currentReadIndex = 0;
        }

        return buffer[currentReadIndex++];
    }
}
