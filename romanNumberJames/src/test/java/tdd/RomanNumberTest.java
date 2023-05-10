package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumberTest {


    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_I_RESULT_ต้องเป็น_1() {

        // Arrange
        int expectedValue = 1;

        // Act
        RomanNumber romanNumber = new RomanNumber();
        Integer actual = romanNumber.convertToNumber("I");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_V_ผลลัพทธ์_ต้องเป็น_5() {

        // Arrange
        int expectedValue = 5;

        // Act
        RomanNumber romanNumber = new RomanNumber();
        Integer actual = romanNumber.convertToNumber("V");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

}
