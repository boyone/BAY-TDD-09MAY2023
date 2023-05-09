package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularBufferTest {

    @Test
    public void สร้าง_CircularBuffer_ครั้งแรกแล้ว_size_ต้องเท่ากับ_0() {
        // Arrange
        int expectedValue = 0;
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        int actualValue = circularBuffer.size();

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void สร้าง_CircularBuffer_ใส่ข้อมูล_a_size_ต้องเท่ากับ_1() {
        // Arrange
        int expectedValue = 1;
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        circularBuffer.add("a");
        int actualValue = circularBuffer.size();

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void สร้าง_CircularBuffer_ใส่ข้อมูล_a_b_size_ต้องเท่ากับ_2() {
        // Arrange
        int expectedValue = 2;
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        circularBuffer.add("a");
        circularBuffer.add("b");
        int actualValue = circularBuffer.size();

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void สร้าง_circularBuffer_maxSize_7() {
        // Arrange
        int expectedValue = 7;
        CircularBuffer circularBuffer = new CircularBuffer(7);

        // Act
        circularBuffer.add("a");
        circularBuffer.add("b");
        circularBuffer.add("c");
        circularBuffer.add("d");
        circularBuffer.add("e");
        circularBuffer.add("f");
        circularBuffer.add("g");
        circularBuffer.add("h");

        int actualValue = circularBuffer.size();

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void สร้าง_circularBuffer_ใส่ข้อมูล_a_b_get_ต้องเท่ากับ_a() {
        // Arrange
        String expectedValue = "a";
        CircularBuffer circularBuffer = new CircularBuffer(7);

        // Act
        circularBuffer.add("a");
        circularBuffer.add("b");
        String actualValue = circularBuffer.get();

        // Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void สร้าง_circularBuffer_ใส่ข้อมูล_d_c_get_ต้องเท่ากับ_d() {
        // Arrange
        String expectedValue = "d";
        CircularBuffer circularBuffer = new CircularBuffer(7);

        // Act
        circularBuffer.add("d");
        circularBuffer.add("c");
        String actualValue = circularBuffer.get();

        // Assert
        assertEquals(expectedValue, actualValue);
    }
}
