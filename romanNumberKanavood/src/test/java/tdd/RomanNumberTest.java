package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    public void romanNumber_of_1_should_be_I() {
        // Arrange
        int input = 1;
        String expectedResult ="I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_2_should_be_II() {
        // Arrange
        int input = 2;
        String expectedResult ="II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_3_should_be_III() {
        // Arrange
        int input = 3;
        String expectedResult ="III";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_4_should_be_IV() {
        // Arrange
        int input = 4;
        String expectedResult ="IV";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_5_should_be_V() {
        // Arrange
        int input = 5;
        String expectedResult ="V";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_6_should_be_VI() {
        // Arrange
        int input = 6;
        String expectedResult ="VI";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_7_should_be_VII() {
        // Arrange
        int input = 7;
        String expectedResult ="VII";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_8_should_be_VIII() {
        // Arrange
        int input = 8;
        String expectedResult ="VIII";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_9_should_be_IX() {
        // Arrange
        int input = 9;
        String expectedResult ="IX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_10_should_be_X() {
        // Arrange
        int input = 10;
        String expectedResult ="X";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_11_should_be_XI() {
        // Arrange
        int input = 11;
        String expectedResult ="XI";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void romanNumber_of_111_should_be_CXI() {
        // Arrange
        int input = 111;
        String expectedResult ="CXI";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_495_should_be_CDXCV() {
        // Arrange
        int input = 495;
        String expectedResult ="CDXCV";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_1259_should_be_MCCLIX() {
        // Arrange
        int input = 1259;
        String expectedResult ="MCCLIX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
