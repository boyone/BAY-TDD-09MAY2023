package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumberTest {


    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_I_ผลลัพธ์_ต้องเป็น_1() {

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

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_X_ผลลัพทธ์_ต้องเป็น_10() {

        // Arrange
        int expectedValue = 10;

        // Act
        RomanNumber romanNumber = new RomanNumber();
        Integer actual = romanNumber.convertToNumber("X");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_L_ผลลัพทธ์_ต้องเป็น_50() {

        // Arrange
        int expectedValue = 50;

        // Act
        RomanNumber romanNumber = new RomanNumber();
        Integer actual = romanNumber.convertToNumber("L");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_C_ผลลัพทธ์_ต้องเป็น_100() {

        // Arrange
        int expectedValue = 100;

        // Act
        RomanNumber romanNumber = new RomanNumber();
        Integer actual = romanNumber.convertToNumber("C");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_D_ผลลัพทธ์_ต้องเป็น_500() {

        // Arrange
        int expectedValue = 500;

        // Act
        RomanNumber romanNumber = new RomanNumber();
        Integer actual = romanNumber.convertToNumber("D");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_M_ผลลัพทธ์_ต้องเป็น_1000() {

        // Arrange
        int expectedValue = 1000;

        // Act
        RomanNumber romanNumber = new RomanNumber();
        Integer actual = romanNumber.convertToNumber("M");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_1_ผลลัพธ์_ต้องเป็น_I() {

        // Arrange
        String expectedValue = "I";

        // Act
        RomanNumber romanNumber = new RomanNumber();
        String actual = romanNumber.convertToRomanNumber(1);

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }


    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_2_ผลลัพธ์_ต้องเป็น_II() {

        // Arrange
        String expectedValue = "II";

        // Act
        RomanNumber romanNumber = new RomanNumber();
        String actual = romanNumber.convertToRomanNumber(2);

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_5_ผลลัพธ์_ต้องเป็น_V() {

        // Arrange
        String expectedValue = "V";

        // Act
        RomanNumber romanNumber = new RomanNumber();
        String actual = romanNumber.convertToRomanNumber(5);

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_Test_Case_ใส่_Input_เป็น_9_ผลลัพธ์_ต้องเป็น_IX() {

        // Arrange
        String expectedValue = "IX";

        // Act
        RomanNumber romanNumber = new RomanNumber();
        String actual = romanNumber.convertToRomanNumber(9);

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }

    @Test
    public void RomanNumber_toFormatRomanNumber_Test_Case_ใส่_Input_เป็น_IIII_ผลลัพธ์_ต้องเป็น_IV() {

        // Arrange
        String expectedValue = "IV";

        // Act
        RomanNumber romanNumber = new RomanNumber();
        String actual = romanNumber.toFormatRomanNumber("IIII");

        // Assert
        Assertions.assertEquals(expectedValue, actual);
    }
}
