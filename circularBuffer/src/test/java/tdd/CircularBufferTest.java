package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularBufferTest {

    @Test
    public void สร้าง_CircularBuffer_ครั้งแรกแล้ว_current_write_index_ต้องเท่ากับ_0() {
        // Arrange
        int expectedValue = 0;
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        int actualValue = circularBuffer.currentWriteIndex();

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void สร้าง_CircularBuffer_ใส่ข้อมูล_a_current_write_index_ต้องเท่ากับ_1() {
        // Arrange
        int expectedValue = 1;
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        circularBuffer.add("a");
        int actualValue = circularBuffer.currentWriteIndex();

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void สร้าง_CircularBuffer_ใส่ข้อมูล_a_get_ข้อมูล_ต้องเท่ากับ_a() {
        // Arrange
        String expectedValue = "a";
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        circularBuffer.add("a");

        // Assert
        assertEquals(expectedValue, circularBuffer.get());
    }

    @Test
    public void สร้าง_CircularBuffer_ใส่ข้อมูล_a_b_c_d_e_f_g_current_current_write_index_ต้องเท่ากับ_7() {
        // Arrange
        int expectedValue = 7;
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        circularBuffer.add("a");
        circularBuffer.add("b");
        circularBuffer.add("c");
        circularBuffer.add("d");
        circularBuffer.add("e");
        circularBuffer.add("f");
        circularBuffer.add("g");

        // Assert
        assertEquals(expectedValue, circularBuffer.currentWriteIndex());
    }

    @Test
    public void สร้าง_CircularBuffer_ใส่ข้อมูล_a_b_c_d_e_f_g_get_ข้อมูล_ครั้งที่_7_ต้องเท่ากับ_g() {
        // Arrange
        String expectedValue = "g";
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        circularBuffer.add("a");
        circularBuffer.add("b");
        circularBuffer.add("c");
        circularBuffer.add("d");
        circularBuffer.add("e");
        circularBuffer.add("f");
        circularBuffer.add("g");

        circularBuffer.get();
        circularBuffer.get();
        circularBuffer.get();
        circularBuffer.get();
        circularBuffer.get();
        circularBuffer.get();
        String result = circularBuffer.get();

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    public void สร้าง_CircularBuffer_ใส่ข้อมูล_a_b_c_d_e_f_g_h_current_current_write_index_ต้องเท่ากับ_1() {
        // Arrange
        int expectedValue = 1;
        CircularBuffer circularBuffer = new CircularBuffer();

        // Act
        circularBuffer.add("a");
        circularBuffer.add("b");
        circularBuffer.add("c");
        circularBuffer.add("d");
        circularBuffer.add("e");
        circularBuffer.add("f");
        circularBuffer.add("g");
        circularBuffer.add("h");

        // Assert
        assertEquals(expectedValue, circularBuffer.currentWriteIndex());
    }
}
