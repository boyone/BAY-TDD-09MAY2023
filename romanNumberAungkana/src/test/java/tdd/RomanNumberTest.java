package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumberTest {

    @Test
    public void romanNumber_of_1_should_be_I() {
        // Arrange
        int input = 1;
        String expectedResult = "I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void romanNumber_of_5_should_be_V() {
        // Arrange
        int input = 5;
        String expectedResult = "V";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void romanNumber_of_10_should_be_X() {
        // Arrange
        int input = 10;
        String expectedResult = "X";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void romanNumber_of_100_should_be_C() {
        // Arrange
        int input = 100;
        String expectedResult = "C";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void romanNumber_of_500_should_be_D() {
        // Arrange
        int input = 500;
        String expectedResult = "D";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void romanNumber_of_1000_should_be_M() {
        // Arrange
        int input = 1000;
        String expectedResult = "M";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void romanNumber_of_2_should_be_II() {
        // Arrange
        int input = 2;
        String expectedResult = "II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }


    @Test
    public void romanNumber_of_3_should_be_III() {
        // Arrange
        int input = 3;
        String expectedResult = "III";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }
}
